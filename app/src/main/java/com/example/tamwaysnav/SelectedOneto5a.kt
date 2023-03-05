package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto5a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto5a)

        val MainActbutton =findViewById<Button>(R.id.button10)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto5b::class.java)
            startActivity(Intent)
        }
    }
}