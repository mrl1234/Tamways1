package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto7c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto7c)

        val MainActbutton =findViewById<Button>(R.id.button21)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto7d::class.java)
            startActivity(Intent)
        }
    }
}