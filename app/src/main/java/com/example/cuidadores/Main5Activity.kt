package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val siguiente= findViewById<Button>(R.id.btnsiguiente1)

        siguiente.setOnClickListener {

            val intent = Intent( this@Main5Activity, Main6Activity::class.java)

            startActivity(intent)    }


    }
}
