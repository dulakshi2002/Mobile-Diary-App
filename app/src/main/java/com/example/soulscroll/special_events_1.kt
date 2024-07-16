package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.soulscroll.R

class special_events_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_events1)

        val btn1 : ImageView = findViewById(R.id.backbtn3)
        btn1.setOnClickListener {
            val intent = Intent(this,home_1::class.java)
            startActivity(intent)
        }
    }
}