package com.example.retrofitexample

import android.bluetooth.BluetoothClass.Service
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {
    public val client=OkHttpClient.Builder().build()
    public val retrofit=Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun<T>buildService(service: Class<T>) :T{
        return retrofit.create(service)
    }
}