package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.habitacion.*
import java.util.*

class Habitacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.habitacion)

        val atras= findViewById<Button>(R.id.btn1)

        leer()

        atras.setOnClickListener {

            val intent = Intent( this@Habitacion, Listaespacios::class.java)

            startActivity(intent)
        }
    }

    fun leer(){
        val scanner = Scanner(resources.openRawResource(R.raw.habitacion))
        var descripcion = " "
        while (scanner.hasNextLine()) {
            val linea = scanner.nextLine()
            descripcion += linea
        }
        scanner.close()

        texto3.setText(descripcion)
    }

}
