package com.example.soulscroll.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import com.example.soulscroll.R

class home_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)


        val btn1 : LinearLayout = findViewById(R.id.linear1)
        btn1.setOnClickListener {
            val intent = Intent(this,notes_1::class.java)
            startActivity(intent)
        }

        val btn2 : LinearLayout = findViewById(R.id.linear2)
        btn1.setOnClickListener {
            val intent = Intent(this,dairy_1::class.java)
            startActivity(intent)
        }

        val btn3 : LinearLayout = findViewById(R.id.linear3)
        btn1.setOnClickListener {
            val intent = Intent(this,special_events_1::class.java)
            startActivity(intent)
        }


        val btn4 : ImageButton = findViewById(R.id.homebtn)
        btn1.setOnClickListener {
            val intent = Intent(this,home_1::class.java)
            startActivity(intent)
        }

        val btn5 : ImageButton = findViewById(R.id.profilebtn)
        btn1.setOnClickListener {
            val intent = Intent(this,profile_1::class.java)
            startActivity(intent)
        }

    }
}