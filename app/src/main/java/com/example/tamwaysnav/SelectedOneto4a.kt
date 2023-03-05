package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto4a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto4a)

        val MainActbutton =findViewById<Button>(R.id.button8)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto4b::class.java)
            startActivity(Intent)
        }
    }
}