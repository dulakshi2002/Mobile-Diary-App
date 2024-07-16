package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soulscroll.R

class onboarding_screen_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen2)

        val btn1 : Button = findViewById(R.id.loginbutton2)
        btn1.setOnClickListener {
            val intent = Intent(this,login_1::class.java)
            startActivity(intent)
        }

        val btn2 : Button = findViewById(R.id.signupbutton5)
        btn1.setOnClickListener {
            val intent = Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}