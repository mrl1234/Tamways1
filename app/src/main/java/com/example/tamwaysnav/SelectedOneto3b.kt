package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto3b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto3b)

        val MainActbutton =findViewById<Button>(R.id.button5)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto3c::class.java)
            startActivity(Intent)
        }
    }
}