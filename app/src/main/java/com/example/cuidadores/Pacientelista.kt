package com.example.cuidadores

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.pacientelista.*

class Pacientelista : AppCompatActivity() {

    private var adaptador: Adaptador3? = null
    private var lista = ArrayList<datositem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pacientelista)

        lista.add(datositem("Organización de espacios", "información para adecuar los escenarios", R.drawable.iconoespacios))
        lista.add(datositem("Rutinas", "información para el cuidado", R.drawable.iconorutina))
        lista.add(datositem("Actividades", "Información sobre interacción", R.drawable.iconoactividad))

        adaptador = Adaptador3(this, lista)
        adaptador!!.notifyDataSetChanged()
        listaa.adapter = adaptador

        val siguientea= findViewById<Button>(R.id.button6)
        val atras= findViewById<Button>(R.id.btn1)

        siguientea.setOnClickListener {

            val intent = Intent( this@Pacientelista, Listaespacios::class.java)

            startActivity(intent)
        }

        atras.setOnClickListener {

            val intent = Intent( this@Pacientelista, Segundalista::class.java)

            startActivity(intent)
        }


    }
}
