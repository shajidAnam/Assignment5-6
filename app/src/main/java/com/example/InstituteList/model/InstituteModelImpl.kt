package com.example.InstituteList.model

import com.example.InstituteList.network.InstituteApiInterface
import com.example.InstituteList.network.RetrofitClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class InstituteModelImpl:InstituteModel {
    private val apiInterface=RetrofitClient.getClient().create(InstituteApiInterface::class.java)
    private val call=apiInterface.getInstituteDetails()

    override fun getInstituteDetails(instituteCallback: InstituteCallback) {
        call.enqueue(object : retrofit2.Callback<MutableList<InstituteDetails>> {
            override fun onResponse(
                call: Call<MutableList<InstituteDetails>>,
                response: Response<MutableList<InstituteDetails>>
            ) {
                response.body()?.let { instituteCallback.onSuccess(it) }
            }

            override fun onFailure(call: Call<MutableList<InstituteDetails>>, t: Throwable) {
               instituteCallback.onError(t)
            }

        })

    }

}