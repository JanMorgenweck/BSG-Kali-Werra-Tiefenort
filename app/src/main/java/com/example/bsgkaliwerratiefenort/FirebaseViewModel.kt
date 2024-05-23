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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.launch

class FirebaseViewModel : ViewModel() {


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
}