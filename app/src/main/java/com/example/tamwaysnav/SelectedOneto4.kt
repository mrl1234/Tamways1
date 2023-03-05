package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto4)

        val MainActbutton =findViewById<Button>(R.id.button7)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto4a::class.java)
            startActivity(Intent)
        }
    }
}