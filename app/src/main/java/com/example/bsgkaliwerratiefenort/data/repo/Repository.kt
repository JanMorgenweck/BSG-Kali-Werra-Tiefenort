package com.example.bsgkaliwerratiefenort.data.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bsgkaliwerratiefenort.data.model.MannschaftAPI
import com.example.bsgkaliwerratiefenort.data.model.Match
import com.example.bsgkaliwerratiefenort.remote.Api

class Repository(private val apiService: Api) {

    private var _mannschaften = MutableLiveData<List<MannschaftAPI>>()
    val mannschaften: LiveData<List<MannschaftAPI>>
        get() = _mannschaften

    suspend fun getMannschaften(leagueShortcut: String, leagueSeason: Int) {
        try {
            val result = apiService.retrofitService.getTable(leagueShortcut, leagueSeason)
            _mannschaften.postValue(result)
        } catch (e: Exception) {
            Log.e("TAG", "Kein laden möglich $e")
        }
    }

    private var _lastMatch = MutableLiveData<Match>()
    val lastMatch: LiveData<Match>
        get() = _lastMatch

    suspend fun getLastMatch(leagueId: Int, teamId: Int): Match? {
        return try {
            val result = apiService.retrofitService.getLastMatch(leagueId, teamId)
            _lastMatch.postValue(result)
            result
        } catch (e: Exception) {
            Log.e("TAG", "Kein laden möglich $e")
            null
        }
    }

    private var _nextMatch = MutableLiveData<Match>()
    val nextMatch: LiveData<Match>
        get() = _nextMatch

    suspend fun getNextMatch(leagueId: Int, teamId: Int): Match? {
        return try {
            val result = apiService.retrofitService.getNextMatch(leagueId, teamId)
            _nextMatch.postValue(result)
            result
        } catch (e: Exception) {
            Log.e("TAG", "Kein laden möglich $e")
            null
        }
    }
}
