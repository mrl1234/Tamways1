package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob5a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob5a)

        val MainActbutton =findViewById<Button>(R.id.button37)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob5b::class.java)
            startActivity(Intent)
        }
    }
}