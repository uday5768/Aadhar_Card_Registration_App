package com.example.aadharcardregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val languages = arrayOf("CHN","IND","PAK","UK","USA")
        val spinner = findViewById<Spinner>(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity2,
                        "Selected Item" + " " +"" + languages[position],
                        Toast.LENGTH_SHORT).show()
                    var outp:String = languages[position]
                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
        val next = findViewById<Button>(R.id.Next)
        next.setOnClickListener() {
            val intent = Intent(this, MainActivity3::class.java).apply { }
            startActivity(intent)
        }
    }
}