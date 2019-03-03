package com.example.ssurendran.allinoneapp.retrofit

import com.example.ssurendran.allinoneapp.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SampleAPI {

    @GET("/api/users?page=2")
    fun getUserList(): Call<List<User>>

    @GET("/api/users/{id}")
    fun getUser(@Path("id") userId: Int): Call<User>

}