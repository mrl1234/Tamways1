package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected6to1f : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected6to1f)

        val MainAcbutton =findViewById<Button>(R.id.button1)
        MainAcbutton.setOnClickListener {
            val Intent = Intent(this,Selected6to1e::class.java)
            startActivity(Intent)
        }

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected6to1g::class.java)
            startActivity(Intent)
        }
    }
}