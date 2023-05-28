package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected15to1b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected15to1b)

        val Mainbutton =findViewById<Button>(R.id.landmark1)
        Mainbutton.setOnClickListener {
            val Intent = Intent(this,Pav::class.java)
            startActivity(Intent)
        }

        val MainAbutton =findViewById<Button>(R.id.landmark)
        MainAbutton.setOnClickListener {
            val Intent = Intent(this,AbbEntrance::class.java)
            startActivity(Intent)
        }

        val MainAcbutton =findViewById<Button>(R.id.button1)
        MainAcbutton.setOnClickListener {
            val Intent = Intent(this,Selected15to1a::class.java)
            startActivity(Intent)
        }

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected15to1c::class.java)
            startActivity(Intent)
        }
    }
}