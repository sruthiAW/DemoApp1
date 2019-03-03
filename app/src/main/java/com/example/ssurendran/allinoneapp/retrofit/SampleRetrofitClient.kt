package com.example.ssurendran.allinoneapp.retrofit

import com.example.ssurendran.allinoneapp.json.UserJsonDeserializer
import com.example.ssurendran.allinoneapp.model.User
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SampleRetrofitClient{

    companion object {
        const val TAG = "SampleRetrofitClient"
        const val BASE_URL = "https://reqres.in/"
    }

    private val retrofit: Retrofit

    init {

        var gson: Gson = GsonBuilder()
                .registerTypeAdapter(User::class.java, UserJsonDeserializer())
                .create()

        retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

    }

    fun getSampleAPI(): SampleAPI = retrofit.create(SampleAPI::class.java)

}