package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected15to5a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected15to5a)

        val MainAcbutton =findViewById<Button>(R.id.button1)
        MainAcbutton.setOnClickListener {
            val Intent = Intent(this,Selected15::class.java)
            startActivity(Intent)
        }

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected15to5b::class.java)
            startActivity(Intent)
        }
    }
}