package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto2c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto2c)

        val MainActbutton =findViewById<Button>(R.id.button3)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto2cc::class.java)
            startActivity(Intent)
        }

    }
}