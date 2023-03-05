package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob3a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob3a)

        val MainActbutton =findViewById<Button>(R.id.button30)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob3b::class.java)
            startActivity(Intent)
        }
    }
}