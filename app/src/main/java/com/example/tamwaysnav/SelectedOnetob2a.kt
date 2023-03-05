package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob2a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob2a)

        val MainActbutton =findViewById<Button>(R.id.button28)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob2b::class.java)
            startActivity(Intent)
        }
    }
}