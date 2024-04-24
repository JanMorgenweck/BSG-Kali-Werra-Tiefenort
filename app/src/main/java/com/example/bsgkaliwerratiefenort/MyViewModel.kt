package com.example.bsgkaliwerratiefenort

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.bsgkaliwerratiefenort.data.repo.Repository
import com.example.bsgkaliwerratiefenort.remote.Api
import com.example.kaliwerra.data.Mannschaft
import kotlinx.coroutines.launch

class MyViewModel(application: Application): AndroidViewModel(application){

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

    fun saveFavorite(mannschaft: Mannschaft){
       val list =  _favoriteTeam.value!!
        list.add(mannschaft)
        _favoriteTeam.value = list
       Log.e("TAG", _favoriteTeam.value.toString()
       )    }
}