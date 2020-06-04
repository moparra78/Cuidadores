package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fase : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fase)

        val siguiente= findViewById<Button>(R.id.btnsiguiente2)

        siguiente.setOnClickListener {

            val intent = Intent( this@Fase, Medicacion::class.java)

            startActivity(intent)    }


    }
}
