package com.example.bsgkaliwerratiefenort.data.model

data class MannschaftAPI(
    val teamInfoId: Int,
    val teamName: String,
    val teamIconUrl: String,
    val points: Int,
    val opponentGoals: Int,
    val goals: Int,
    val matches: Int,
    val won: Int,
    val lost: Int,
    val draw: Int,
    val goalDiff: Int
)
