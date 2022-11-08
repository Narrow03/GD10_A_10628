package com.richardo.gd10_a_10628

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RClient {
    private const val BASE_URL = "http://192.168.18.14/ci4-apiserver/public/"
    val instances:api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }

}