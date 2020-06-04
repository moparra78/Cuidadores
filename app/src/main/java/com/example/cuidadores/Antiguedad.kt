package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Antiguedad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.antiguedad)

        val siguiente= findViewById<Button>(R.id.btnsiguiente2)

        siguiente.setOnClickListener {

            val intent = Intent( this@Antiguedad, Fase::class.java)

            startActivity(intent)    }

    }
}
