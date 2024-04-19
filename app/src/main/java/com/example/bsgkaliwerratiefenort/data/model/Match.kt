package com.example.bsgkaliwerratiefenort.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Match(
    @Json(name = "matchID") val matchID: Int,
    @Json(name = "matchDateTime") val matchDateTime: String,
    @Json(name = "timeZoneID") val timeZoneID: String,
    @Json(name = "leagueId") val leagueId: Int,
    @Json(name = "leagueName") val leagueName: String,
    @Json(name = "leagueSeason") val leagueSeason: Int,
    @Json(name = "leagueShortcut") val leagueShortcut: String,
    @Json(name = "matchDateTimeUTC") val matchDateTimeUTC: String,
    @Json(name = "group") val group: Group,
    @Json(name = "team1") val team1: Team,
    @Json(name = "team2") val team2: Team,
    @Json(name = "lastUpdateDateTime") val lastUpdateDateTime: String,
    @Json(name = "matchIsFinished") val matchIsFinished: Boolean,
    @Json(name = "matchResults") val matchResults: List<MatchResult>,
    @Json(name = "goals") val goals: List<Goal>,
    @Json(name = "location") val location: Location,
    @Json(name = "numberOfViewers") val numberOfViewers: Int?
)

@JsonClass(generateAdapter = true)
data class Group(
    @Json(name = "groupName") val groupName: String,
    @Json(name = "groupOrderID") val groupOrderID: Int,
    @Json(name = "groupID") val groupID: Int
)

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "teamId") val teamId: Int,
    @Json(name = "teamName") val teamName: String,
    @Json(name = "shortName") val shortName: String,
    @Json(name = "teamIconUrl") val teamIconUrl: String,
    @Json(name = "teamGroupName") val teamGroupName: String?
)

@JsonClass(generateAdapter = true)
data class MatchResult(
    @Json(name = "resultID") val resultID: Int,
    @Json(name = "resultName") val resultName: String,
    @Json(name = "pointsTeam1") val pointsTeam1: Int,
    @Json(name = "pointsTeam2") val pointsTeam2: Int,
    @Json(name = "resultOrderID") val resultOrderID: Int,
    @Json(name = "resultTypeID") val resultTypeID: Int,
    @Json(name = "resultDescription") val resultDescription: String
)

@JsonClass(generateAdapter = true)
data class Goal(
    @Json(name = "goalID") val goalID: Int,
    @Json(name = "scoreTeam1") val scoreTeam1: Int,
    @Json(name = "scoreTeam2") val scoreTeam2: Int,
    @Json(name = "matchMinute") val matchMinute: Int?,
    @Json(name = "goalGetterID") val goalGetterID: Int,
    @Json(name = "goalGetterName") val goalGetterName: String,
    @Json(name = "isPenalty") val isPenalty: Boolean,
    @Json(name = "isOwnGoal") val isOwnGoal: Boolean,
    @Json(name = "isOvertime") val isOvertime: Boolean,
    @Json(name = "comment") val comment: String?
)

@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "locationID") val locationID: Int,
    @Json(name = "locationCity") val locationCity: String,
    @Json(name = "locationStadium") val locationStadium: String
)

