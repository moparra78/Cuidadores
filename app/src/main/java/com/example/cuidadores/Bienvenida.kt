package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bienvenida : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bienvenida)

        val inicio= findViewById<Button>(R.id.btn1)

    inicio.setOnClickListener {

        val intent = Intent( this@Bienvenida, Primeralista::class.java)

        startActivity(intent)    }

}
}
