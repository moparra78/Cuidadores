package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val siguiente= findViewById<Button>(R.id.btnsiguiente1)

        siguiente.setOnClickListener {

            val intent = Intent( this@MainActivity, Main3Activity::class.java)

            startActivity(intent)    }

    }
}
