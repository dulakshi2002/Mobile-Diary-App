package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.soulscroll.R

class notes_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes1)

        val btn1 : ImageView = findViewById(R.id.backbtn)
        btn1.setOnClickListener {
            val intent = Intent(this,home_1::class.java)
            startActivity(intent)
        }
    }
}