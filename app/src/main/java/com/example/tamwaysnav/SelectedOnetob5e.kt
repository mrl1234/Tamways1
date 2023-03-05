package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOnetob5e : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_onetob5e)

        val MainActbutton =findViewById<Button>(R.id.button41)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOnetob5f::class.java)
            startActivity(Intent)
        }
    }
}