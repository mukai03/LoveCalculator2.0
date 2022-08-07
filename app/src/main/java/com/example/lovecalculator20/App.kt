package com.example.lovecalculator20

import android.app.Application
import com.example.lovecalculator20.network.LoveApi
import com.example.lovecalculator20.network.RetrofitService

class App : Application() {

    companion object{
        lateinit var api : LoveApi
    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.api
    }
}