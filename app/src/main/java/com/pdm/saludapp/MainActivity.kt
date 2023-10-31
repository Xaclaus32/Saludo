package com.pdm.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName: AppCompatEditText = findViewById(R.id.etName)
        val btnHello: AppCompatButton = findViewById(R.id.btnHello)
        val btnIntent: AppCompatButton = findViewById(R.id.btnIntent)

        btnHello.setOnClickListener {
            val name = etName.text.toString()
            Toast.makeText(this, "“Hola $name!”", Toast.LENGTH_SHORT).show()


        }

        btnIntent.setOnClickListener {
            val name = etName.text.toString()
            val intentGA = Intent(this, GreetingActivity::class.java)
            intentGA.putExtra("EXTRA_NAME", name)
            startActivity(intentGA)


        }



    }
}