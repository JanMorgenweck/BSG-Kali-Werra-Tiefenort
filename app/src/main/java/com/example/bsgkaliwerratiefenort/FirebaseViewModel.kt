package com.example.bsgkaliwerratiefenort

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bsgkaliwerratiefenort.data.model.Profile
import com.example.bsgkaliwerratiefenort.data.repo.Repository
import com.example.bsgkaliwerratiefenort.remote.Api
import com.example.kaliwerra.data.Datasource
import com.example.kaliwerra.data.Mannschaft
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.launch

class FirebaseViewModel() : ViewModel() {


    private val firebaseAuth = FirebaseAuth.getInstance()


    private val fireStore = FirebaseFirestore.getInstance()


    private val storage: FirebaseStorage = FirebaseStorage.getInstance()
    private val storageRef = storage.reference


    private var _currentUser = MutableLiveData<FirebaseUser?>(firebaseAuth.currentUser)
    val currentUser: LiveData<FirebaseUser?>
        get() = _currentUser


    lateinit var profileRef: DocumentReference

    private val _profilePictureUri = MutableLiveData<Uri>()
    val profilePictureUri: LiveData<Uri>
        get() = _profilePictureUri


    init {
        if (firebaseAuth.currentUser != null) {
            profileRef = fireStore.collection("profiles").document(firebaseAuth.currentUser!!.uid)
        }
    }

    fun uploadImage(uri: Uri) {
        val imageRef = storageRef.child("images/${firebaseAuth.currentUser!!.uid}/profilePic")
        val uploadTask = imageRef.putFile(uri)

        uploadTask.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                imageRef.downloadUrl.addOnCompleteListener { urlTask ->
                    if (urlTask.isSuccessful) {
                        _profilePictureUri.value = urlTask.result
                    }
                }
            } else {
                Log.e("FirebaseViewModel", "Upload failed: ${task.exception}")
            }
        }
    }

    fun updateProfile(profile: Profile) {
        profileRef.set(profile)
        Log.e("FirebaseViewModel", "Profile updated successfully")
    }


    fun updateProfilePicture() {
        profilePictureUri.value?.let { uri ->
            profileRef.update("profilePicture", uri.toString())
                .addOnSuccessListener {
                    Log.d("FirebaseViewModel", "Profile Picture updated successfully")
                }
                .addOnFailureListener { e ->
                    Log.e("FirebaseViewModel", "Error updating profile: $e")
                }
        }
    }

    fun register(email: String, password: String) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { authResult ->
                if (authResult.isSuccessful) {
                    firebaseAuth.currentUser?.sendEmailVerification()
                    profileRef =
                        fireStore.collection("profiles").document(firebaseAuth.currentUser!!.uid)
                    profileRef.set(Profile(email, password))
                    logout()
                } else {
                    Log.e("FIREBASE", "${authResult.exception}")
                }
            }
    }

    fun login(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { authResult ->
                if (authResult.isSuccessful) {
                    if (firebaseAuth.currentUser!!.isEmailVerified) {
                        profileRef = fireStore.collection("profiles")
                            .document(firebaseAuth.currentUser!!.uid)

                        _currentUser.value = firebaseAuth.currentUser
                    } else {
                        Log.e("FIREBASE", "User not verified")
                        logout()
                    }

                } else {
                    Log.e("FIREBASE", "${authResult.exception}")
                }
            }
    }

    fun sendPasswordReset(email: String) {
        firebaseAuth.sendPasswordResetEmail(email)
    }

    fun logout() {
        firebaseAuth.signOut()
        _currentUser.value = firebaseAuth.currentUser
    }

    private val repository = Repository(Api)

    val mannschaften = repository.mannschaften

    val lastMatch = repository.lastMatch

    val nextMatch = repository.nextMatch


    fun loadMannschaften(leagueShortcut:String,leagueSeason: Int){
        viewModelScope.launch {
            repository.getMannschaften(leagueShortcut,leagueSeason)
        }
    }


    fun loadLastMatch(leagueId: Int, teamId: Int){
        viewModelScope.launch {
            repository.getLastMatch(leagueId, teamId)
        }
    }


    fun  loadNextMatch(leagueId: Int, teamId: Int){
        viewModelScope.launch {
            repository.getNextMatch(leagueId, teamId)
        }
    }

    private var _favoriteTeam = MutableLiveData<MutableList<Mannschaft>>(mutableListOf())
    val favoriteTeam: LiveData<MutableList<Mannschaft>>
        get() = _favoriteTeam




    fun addFavorite(mannschaft: Mannschaft) {
        viewModelScope.launch {
            // Fügen Sie das favorisierte Team zur Liste der Favoriten hinzu
            _favoriteTeam.value?.add(mannschaft)
            Log.e("TAG", _favoriteTeam.value.toString())
            // Aktualisieren Sie das Firebase-Profil des Benutzers
           updateFavorites(_favoriteTeam.value ?: mutableListOf())
        }
    }

    fun removeFavorite(mannschaft: Mannschaft) {
        viewModelScope.launch {
            // Entfernen Sie das favorisierte Team aus der Liste der Favoriten
            _favoriteTeam.value?.remove(mannschaft)
            // Aktualisieren Sie das Firebase-Profil des Benutzers
            updateFavorites(_favoriteTeam.value ?: mutableListOf())
        }
    }

    private fun updateFavorites(favorites: MutableList<Mannschaft>?) {
        currentUser.value?.uid?.let { userId ->
            val favoriteNames = favorites?.map { it.name }
            val userRef = fireStore.collection("profiles").document(userId)
            userRef.update("favorites", favoriteNames)
                .addOnSuccessListener {
                    Log.d("FirebaseViewModel", "Favorites updated successfully")
                }
                .addOnFailureListener { e ->
                    Log.e("FirebaseViewModel", "Error updating favorites: $e")
                }
        }
    }

    fun loadFavoritesFromFirebase() {
        currentUser.value?.uid?.let { userId ->
            val userRef = fireStore.collection("profiles").document(userId)
            userRef.get()
                .addOnSuccessListener { document ->
                    if(document.exists()){
                        val favorites = document.data?.get("favorites") as? List<String>
                        favorites?.let { processFavorites(it) }
                }else{
                    Log.e("FirebaseViewModel", "User document not found")
                    }
        }
                .addOnFailureListener{ e ->
                    Log.e("FirebaseViewModel", "Error loading favorites: $e")
                }
        }
    }

    private fun processFavorites(favorites: List<String>) {
        val favoriteMannschaften = mutableListOf<Mannschaft>()

        // Annahme: Du hast eine Liste aller Mannschaften, aus der du die Favoriten extrahieren kannst
        val datasource = Datasource()
        val allMannschaften: List<Mannschaft> = datasource.loadMannschaften() // Hier erhältst du die Liste aller Mannschaften, z. B. aus deinem Repository

            // Durchgehe die Liste aller Mannschaften und überprüfe, ob sie in den Favoriten enthalten sind
            for (mannschaft in allMannschaften) {
                if (favorites.contains(mannschaft.name)) {
                    favoriteMannschaften.add(mannschaft)
                }
            }

        // Aktualisiere die LiveData-Variable favoriteTeam mit den Favoriten
        _favoriteTeam.value = favoriteMannschaften
    }
}

