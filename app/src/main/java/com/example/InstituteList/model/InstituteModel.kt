package com.example.InstituteList.model

interface InstituteModel {
//    fun getInstituteList(): MutableList<InstituteDetails>
//    fun getInstituteItemById(id: Int): InstituteDetails
      fun getInstituteDetails(instituteCallback: InstituteCallback)
}