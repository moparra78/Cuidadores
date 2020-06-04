package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Plan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plan)

        val siguiente= findViewById<Button>(R.id.btn1)

        siguiente.setOnClickListener {

            val intent = Intent( this@Plan, Segundalista::class.java)

            startActivity(intent)    }

    }
}
