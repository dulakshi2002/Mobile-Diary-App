package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soulscroll.R

class login_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        val btn1 : Button = findViewById(R.id.login)
        btn1.setOnClickListener {
            val intent = Intent(this,home_1::class.java)
            startActivity(intent)
        }

    }
}