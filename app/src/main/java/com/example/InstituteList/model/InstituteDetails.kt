package com.example.InstituteList.model

import java.io.Serializable

data class InstituteDetails (
        val id :Int,
        val InstituteName:String,
        val DistrictValue:String,
        val ChiefValue:String,
        val InstituteEmail:String,
        val InstitutePhone:String,
        val InstituteImageUrl:String
):Serializable