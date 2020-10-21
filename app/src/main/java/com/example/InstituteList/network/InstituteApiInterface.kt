package com.example.InstituteList.network

import com.example.InstituteList.model.InstituteDetails
import retrofit2.Call
import retrofit2.http.GET

interface InstituteApiInterface {
    @GET("shajidAnam/Assignment5-6/main/data/instituteDetails.json")
    fun getInstituteDetails(): Call<MutableList<InstituteDetails>>
}