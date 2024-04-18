package com.example.bsgkaliwerratiefenort.data.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bsgkaliwerratiefenort.data.model.MannschaftAPI
import com.example.bsgkaliwerratiefenort.remote.Api
import com.example.bsgkaliwerratiefenort.remote.ApiService

class Repository ( private val apiService: Api){

    private var _mannschaften = MutableLiveData<List<MannschaftAPI>>()
    val mannschaften : LiveData<List<MannschaftAPI>>
        get() = _mannschaften


    suspend fun getMannschaften(leagueShortcut:String,leagueSeason: Int){
        try {
            val result = apiService.retrofitService.getTable(leagueShortcut, leagueSeason)
            _mannschaften.postValue(result)
        } catch (e:Exception){
            Log.e("TAG", "Kein laden möglich $e")
        }
    }
}