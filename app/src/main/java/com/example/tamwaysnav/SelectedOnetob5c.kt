package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob5c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob5c)

        val MainActbutton =findViewById<Button>(R.id.button39)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob5d::class.java)
            startActivity(Intent)
        }
    }
}