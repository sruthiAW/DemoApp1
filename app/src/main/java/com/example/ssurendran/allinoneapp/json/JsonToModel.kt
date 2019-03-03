package com.example.ssurendran.allinoneapp.json

import com.google.gson.Gson

inline fun <reified T: JsonConvertable> String.toModelObject() : T = Gson().fromJson(this, T::class.java)