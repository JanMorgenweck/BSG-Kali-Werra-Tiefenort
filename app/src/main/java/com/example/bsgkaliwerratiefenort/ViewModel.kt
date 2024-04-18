package com.example.bsgkaliwerratiefenort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bsgkaliwerratiefenort.data.repo.Repository
import com.example.bsgkaliwerratiefenort.remote.Api
import kotlinx.coroutines.launch

open class ViewModel: ViewModel(){

    private val repository = Repository(Api)
    val mannschaften = repository.mannschaften



    fun loadMannschaften(leagueShortcut:String,leagueSeason: Int){
        viewModelScope.launch {
            repository.getMannschaften(leagueShortcut,leagueSeason)
        }
    }

}