package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob6f : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob6f)

        val MainActbutton =findViewById<Button>(R.id.button47)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob6g::class.java)
            startActivity(Intent)
        }
    }
}