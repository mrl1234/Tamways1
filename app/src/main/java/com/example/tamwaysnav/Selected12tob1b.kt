package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected12tob1b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected12tob1b)

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected12tob1c::class.java)
            startActivity(Intent)
        }
    }
}