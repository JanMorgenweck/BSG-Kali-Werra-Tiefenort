package com.example.kaliwerra.data

import android.net.Uri
import retrofit2.http.Url

data class Mannschaften(
    val name: String,
    val image: String,
    val info:String,
    val email: String,
    val fbde: String,
    val link: String
)
