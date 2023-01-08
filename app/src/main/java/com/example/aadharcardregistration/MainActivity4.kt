package com.example.aadharcardregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var back=findViewById<Button>(R.id.Backbtn)
        var consent=findViewById<Button>(R.id.Consent)

        back.setOnClickListener(){
            val intent = Intent(this, MainActivity3::class.java).apply { }
            startActivity(intent)
        }

        consent.setOnClickListener(){
            val intent = Intent(this, MainActivity5::class.java).apply { }
            startActivity(intent)
        }
    }
}