package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob6c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob6c)

        val MainActbutton =findViewById<Button>(R.id.button44)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob6d::class.java)
            startActivity(Intent)
        }
    }
}