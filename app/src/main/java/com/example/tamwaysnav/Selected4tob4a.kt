package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selected4tob4a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected4tob4a)

        val MainActbutton =findViewById<Button>(R.id.button2)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,Selected4tob4b::class.java)
            startActivity(Intent)
        }
    }
}