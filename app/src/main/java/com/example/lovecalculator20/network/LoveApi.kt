package com.example.lovecalculator20.network

import com.example.lovecalculator20.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun calculate(
        @Query("sname")secondName: String,
        @Query("fname")firstName: String,
        @Header("X-RapidAPI-Key")key: String = "5117cefdb8msh6239bbc071e85f2p1135a7jsn0eadd39e2649",
        @Header("X-RapidAPI-Host")host: String = "love-calculator.p.rapidapi.com"
    ):Call<LoveModel>
}