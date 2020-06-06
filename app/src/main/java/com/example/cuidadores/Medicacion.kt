package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Medicacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medicacion)

        val atras= findViewById<Button>(R.id.btn1)

        atras.setOnClickListener {

            val intent = Intent( this@Medicacion, Primeralista::class.java)

            startActivity(intent)
        }

    }
}
