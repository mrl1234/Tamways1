package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto7b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto7b)

        val MainActbutton =findViewById<Button>(R.id.button20)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto7c::class.java)
            startActivity(Intent)
        }
    }
}