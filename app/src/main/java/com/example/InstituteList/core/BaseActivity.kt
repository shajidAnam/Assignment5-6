    package com.example.InstituteList.core

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

abstract class BaseActivity:AppCompatActivity() {
    abstract fun setLayoutId():Int
    abstract fun setToolbar():Toolbar
    abstract val isHomeUpButtonEnable: Boolean


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        setActionBar(setToolbar(), isHomeUpButtonEnable)
    }

    private fun setActionBar(toolbar: Toolbar, homeUpButtonEnable: Boolean){
        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(isHomeUpButtonEnable)
        supportActionBar?.setDisplayHomeAsUpEnabled(isHomeUpButtonEnable)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}