package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected6tob1e : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected6tob1e)

        val MainAbutton =findViewById<Button>(R.id.landmark)
        MainAbutton.setOnClickListener {
            val Intent = Intent(this,AbbEntrance::class.java)
            startActivity(Intent)
        }

        val MainAcbutton =findViewById<Button>(R.id.button1)
        MainAcbutton.setOnClickListener {
            val Intent = Intent(this,Selected6tob1d::class.java)
            startActivity(Intent)
        }

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}