package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto7f : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto7f)

        val MainActbutton =findViewById<Button>(R.id.button24)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto7g::class.java)
            startActivity(Intent)
        }
    }
}