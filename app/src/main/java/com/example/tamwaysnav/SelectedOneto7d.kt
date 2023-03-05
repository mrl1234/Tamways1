package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto7d : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto7d)

        val MainActbutton =findViewById<Button>(R.id.button22)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto7e::class.java)
            startActivity(Intent)
        }
    }
}