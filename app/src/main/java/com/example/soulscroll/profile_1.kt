package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soulscroll.R

class profile_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile1)

        val btn1 : Button = findViewById(R.id.editbtn)
        btn1.setOnClickListener {
            val intent = Intent(this,edit_profile_1::class.java)
            startActivity(intent)
        }

        val btn2 : Button = findViewById(R.id.deletebtn)
        btn1.setOnClickListener {
            val intent = Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}