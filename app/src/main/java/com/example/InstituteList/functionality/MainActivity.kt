package com.example.InstituteList.functionality

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.InstituteList.ClickListner.onClickListner
import com.example.InstituteList.R
import com.example.InstituteList.core.BaseActivity
import com.example.InstituteList.model.InstituteCallback
import com.example.InstituteList.model.InstituteDetails
import com.example.InstituteList.model.InstituteModel
import com.example.InstituteList.model.InstituteModelImpl
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : BaseActivity() {
    lateinit var instituteModel:InstituteModel
    override fun setLayoutId(): Int = R.layout.activity_main

    override fun setToolbar(): Toolbar {
        toolbar.setTitle(R.string.app_name)
        return toolbar
    }

    override val isHomeUpButtonEnable: Boolean
        get() = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        showInstitute()
    }

    private fun showInstitute() {
       val instituteModel=InstituteModelImpl()
        val instituteDetails=instituteModel.getInstituteDetails(object :InstituteCallback{
            override fun onSuccess(instituteDetails: InstituteDetails) {
                TODO("Not yet implemented")
            }

            override fun onError(errorMessage: Throwable) {
                TODO("Not yet implemented")
            }

        })
//        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        recyclerView.adapter=adapter
    }
}