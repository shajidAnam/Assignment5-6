package com.example.InstituteList.model

interface InstituteCallback {
    fun onSuccess(instituteDetails: InstituteDetails)
    fun onError(errorMessage: Throwable)
}