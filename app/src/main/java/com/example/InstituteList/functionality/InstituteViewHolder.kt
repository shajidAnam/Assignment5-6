package com.example.InstituteList.functionality

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.InstituteList.R

class InstituteViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    val iv_InstituteImage:AppCompatImageView=itemView.findViewById(R.id.iv_institute_pic)
    val tv_InstituteName:AppCompatTextView=itemView.findViewById(R.id.tv_instituteName)
    //val tv_InstituteDistrictNameLebel:AppCompatTextView=itemView.findViewById(R.id.tv_instituteDistrictLebel)
    val tv_InstituteDistrictNameValue:AppCompatTextView=itemView.findViewById(R.id.tv_instituteDistrictValue)
   // val tv_instituteChiefLebel:AppCompatTextView=itemView.findViewById(R.id.tv_instituteChiefLebel)
    val tv_instituteChiefValue:AppCompatTextView=itemView.findViewById(R.id.tv_instituteChiefValue)
    val tv_email:AppCompatTextView=itemView.findViewById(R.id.tv_email)
    val tv_instituteNumber:AppCompatTextView=itemView.findViewById(R.id.tv_instituteNumber)

}