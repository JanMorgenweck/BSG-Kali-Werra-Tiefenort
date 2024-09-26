package de.janmorgenweck.bsgkaliwerratiefenort.data

import com.google.firebase.database.PropertyName

data class Mannschaft(
    var id: String = "", // Standardwert hinzufügen
    val name: String = "",
    val image: String = "",
    val info: String = "",
    val email: String = "",
    val fbde: String = "",
    val link: String = "",
    val leagueShortcut: String = "",
    val leagueSeason: Int = 0,
    val leagueId: Int = 0,
    val teamId: Int = 0
)
