package com.example.InstituteList.functionality

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.InstituteList.ClickListner.onClickListner
import com.example.InstituteList.R
import com.example.InstituteList.model.InstituteDetails

class InstituteListAdapter(private val InstitutionList:MutableList<InstituteDetails>,private val itemClickListener:onClickListner) : RecyclerView.Adapter<InstituteViewHolder>(){
    private lateinit var context:Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstituteViewHolder {
       context=parent.context
        val view=LayoutInflater.from(context).inflate(R.layout.item_institute,parent,false)
        return InstituteViewHolder(view)
    }

    override fun onBindViewHolder(holder: InstituteViewHolder, position: Int) {
        val institute=InstitutionList[position]
        holder.tv_InstituteName.text=institute.InstituteName
        holder.tv_InstituteDistrictNameValue.text=institute.DistrictValue
        holder.tv_instituteChiefValue.text=institute.ChiefValue
        holder.tv_email.text=institute.InstituteEmail
        holder.tv_instituteNumber.text=institute.InstitutePhone

        holder.itemView.setOnClickListener {
           itemClickListener.onItemClickListener(position)
        }
    }

    override fun getItemCount(): Int {
        return InstitutionList.size
    }
}