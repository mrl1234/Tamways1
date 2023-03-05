package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto6a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto6a)

        val MainActbutton =findViewById<Button>(R.id.button14)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto6b::class.java)
            startActivity(Intent)
        }
    }
}