package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto2d : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto2d)

        val MainActbutton =findViewById<Button>(R.id.button6)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto2e::class.java)
            startActivity(Intent)
        }

    }
}