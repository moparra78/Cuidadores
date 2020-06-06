package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fase : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fase)

        val atras= findViewById<Button>(R.id.btn1)

        atras.setOnClickListener {

            val intent = Intent( this@Fase, Primeralista::class.java)

            startActivity(intent)
        }


    }
}
