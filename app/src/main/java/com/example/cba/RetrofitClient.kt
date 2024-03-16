package com.example.cba

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://ipapi.co/json/") // Set the complete base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getApiService(): ApiInterface {
        return retrofit.create(ApiInterface::class.java)
    }
}