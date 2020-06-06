package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Antiguedad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.antiguedad)

        val atras= findViewById<Button>(R.id.btn1)

        atras.setOnClickListener {

            val intent = Intent( this@Antiguedad, Primeralista::class.java)

            startActivity(intent)
        }

    }
}
