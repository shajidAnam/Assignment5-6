package com.example.InstituteList.model

interface InstituteCallback {
    fun onSuccess(instituteDetails:MutableList<InstituteDetails>)
    fun onError(errorMessage: Throwable)
}