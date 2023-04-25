package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected7to1a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected7to1a)

        val MainAcbutton =findViewById<Button>(R.id.button1)
        MainAcbutton.setOnClickListener {
            val Intent = Intent(this,Selected7::class.java)
            startActivity(Intent)
        }

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected7to1b::class.java)
            startActivity(Intent)
        }
    }
}