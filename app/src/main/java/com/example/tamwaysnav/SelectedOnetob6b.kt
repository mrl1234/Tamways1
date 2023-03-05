package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob6b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob6b)

        val MainActbutton =findViewById<Button>(R.id.button43)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob6c::class.java)
            startActivity(Intent)
        }
    }
}