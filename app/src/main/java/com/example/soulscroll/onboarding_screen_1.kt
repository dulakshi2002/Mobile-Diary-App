package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.soulscroll.R

class onboarding_screen_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen1)

        val btn1 : ImageView = findViewById(R.id.onboarding1)
        btn1.setOnClickListener {
            val intent = Intent(this,onboarding_screen_2::class.java)
            startActivity(intent)
        }

    }
}