package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soulscroll.R

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn1 : Button = findViewById(R.id.submit)
        btn1.setOnClickListener {
            val intent = Intent(this,home_1::class.java)
            startActivity(intent)
        }
    }
}