package de.janmorgenweck.bsgkaliwerratiefenort.data.model

import android.util.Log

import com.google.firebase.firestore.FirebaseFirestore
import de.janmorgenweck.bsgkaliwerratiefenort.data.Mannschaft

class FirestoreDatasource {

    private val db = FirebaseFirestore.getInstance()

    fun loadMannschaften(callback: (List<Mannschaft>) -> Unit) {
        db.collection("mannschaften")
            .get()
            .addOnSuccessListener { result ->
                val mannschaftList = mutableListOf<Mannschaft>()
                for (document in result) {
                    val mannschaft = document.toObject(Mannschaft::class.java)
                    mannschaftList.add(mannschaft)
                }
                Log.d("FirestoreDatasource", "Geladene Mannschaften: $mannschaftList")
                callback(mannschaftList)
            }
            .addOnFailureListener { exception ->
                Log.e("FirestoreDatasource", "Fehler beim Laden der Daten: ${exception.message}")
            }
    }
}