package com.example.aadharcardregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var proceed=findViewById<Button>(R.id.proceed)
        proceed.setOnClickListener(){
            val intent = Intent(this, MainActivity4::class.java).apply { }
            startActivity(intent)
        }
    }
}