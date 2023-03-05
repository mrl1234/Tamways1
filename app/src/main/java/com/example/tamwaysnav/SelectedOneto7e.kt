package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectedOneto7e : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_oneto7e)

        val MainActbutton =findViewById<Button>(R.id.button23)
        MainActbutton.setOnClickListener {
            val Intent = Intent(this,SelectedOneto7f::class.java)
            startActivity(Intent)
        }
    }
}