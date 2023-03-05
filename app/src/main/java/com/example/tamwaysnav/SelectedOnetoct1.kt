package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetoct1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetoct1)

        val MainActbutton =findViewById<Button>(R.id.button26)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetoct11::class.java)
            startActivity(Intent)
        }
    }
}