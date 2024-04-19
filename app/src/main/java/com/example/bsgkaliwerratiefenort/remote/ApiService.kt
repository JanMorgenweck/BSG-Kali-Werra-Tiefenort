package com.example.bsgkaliwerratiefenort.remote

import com.example.bsgkaliwerratiefenort.data.model.MannschaftAPI
import com.example.bsgkaliwerratiefenort.data.model.Match
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

const val BASE_URL = "https://api.openligadb.de/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val loggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}

private val client = OkHttpClient.Builder()
    .addInterceptor(loggingInterceptor)
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .client(client)
    .build()

interface ApiService{

    @GET("getbltable/{leagueShortcut}/{leagueSeason}")
    suspend fun getTable(@Path("leagueShortcut") leagueShortcut:String, @Path("leagueSeason") leagueSeason:Int):List<MannschaftAPI>

    @GET("getlastmatchbyleagueteam/{leagueId}/{teamId}")
    suspend fun getLastMatch(@Path("leagueId") leagueId: Int, @Path("teamId") teamId: Int): Match

    @GET("getnextmatchbyleagueteam/{leagueId}/{teamId}")
    suspend fun getNextMatch(@Path("leagueId") leagueId: Int, @Path("teamId") teamId: Int): Match



}

object Api {
    val retrofitService: ApiService by lazy { retrofit.create(ApiService::class.java) }
}