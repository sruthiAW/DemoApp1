package com.example.ssurendran.allinoneapp.json

import com.google.gson.Gson

interface JsonConvertable {
    fun toJson():String = Gson().toJson(this)
}