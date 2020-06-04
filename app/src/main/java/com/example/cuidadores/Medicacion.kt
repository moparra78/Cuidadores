package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Medicacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medicacion)

        val siguiente= findViewById<Button>(R.id.btnsiguiente2)

        siguiente.setOnClickListener {

            val intent = Intent( this@Medicacion, Plan::class.java)

            startActivity(intent)    }


    }
}
