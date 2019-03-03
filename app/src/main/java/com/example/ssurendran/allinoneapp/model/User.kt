package com.example.ssurendran.allinoneapp.model

import com.example.ssurendran.allinoneapp.json.JsonConvertable
import com.google.gson.annotations.SerializedName


data class User(
        val id: Int,
        @SerializedName("first_name") val first: String,
        @SerializedName("last_name") val last: String,
        val avatar: String) : JsonConvertable