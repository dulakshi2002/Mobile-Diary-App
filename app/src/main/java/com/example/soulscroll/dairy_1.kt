package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.soulscroll.R

class dairy_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dairy1)

        val btn1 : ImageView = findViewById(R.id.backbtn3)
        btn1.setOnClickListener {
            val intent = Intent(this,home_1::class.java)
            startActivity(intent)
        }

    }
}