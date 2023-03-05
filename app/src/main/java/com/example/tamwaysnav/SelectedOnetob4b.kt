package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob4b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob4b)

        val MainActbutton =findViewById<Button>(R.id.button34)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob4c::class.java)
            startActivity(Intent)
        }
    }
}