package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soulscroll.R

class edit_profile_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile1)

        val btn1 : Button = findViewById(R.id.editbtn)
        btn1.setOnClickListener {
            val intent = Intent(this,profile_1::class.java)
            startActivity(intent)
        }

    }
}