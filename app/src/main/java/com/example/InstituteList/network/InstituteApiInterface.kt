package com.example.InstituteList.network

import com.example.InstituteList.model.InstituteDetails
import retrofit2.Call
import retrofit2.http.GET

interface InstituteApiInterface {
    @GET("hasancse91/android-course-v2/master/07_Retrofit_GET_Request/data/food.json")
    fun getInstituteDetails(): Call<InstituteDetails>
}