package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected4tob5d : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected4tob5d)

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected4tob5e::class.java)
            startActivity(Intent)
        }
    }
}