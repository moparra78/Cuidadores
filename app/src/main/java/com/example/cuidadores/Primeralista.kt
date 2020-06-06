package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import kotlinx.android.synthetic.main.primeralista.*

class Primeralista : AppCompatActivity() {

    private var adaptador: Adaptador1? = null
    private var lista = ArrayList<datositem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.primeralista)

        lista.add(datositem("Antiguedad", "Tiempo de padecimiento", R.drawable.iconoantiguedad))
        lista.add(datositem("Fase", "Estado de la enfermedad", R.drawable.iconofase))
        lista.add(datositem("Medicación", "Medicamentos que ingiere", R.drawable.iconomedicacion))

        adaptador = Adaptador1(this, lista)
        adaptador!!.notifyDataSetChanged()
        listaa.adapter = adaptador


        val siguientea= findViewById<Button>(R.id.button)
        val siguienteb= findViewById<Button>(R.id.button2)
        val siguientec= findViewById<Button>(R.id.button3)
        val continuar= findViewById<Button>(R.id.btn)

        siguientea.setOnClickListener {

            val intent = Intent( this@Primeralista, Antiguedad::class.java)

            startActivity(intent)
        }

        siguienteb.setOnClickListener {

            val intent = Intent( this@Primeralista, Fase::class.java)

            startActivity(intent)
        }

        siguientec.setOnClickListener {

            val intent = Intent( this@Primeralista, Medicacion::class.java)

            startActivity(intent)
        }

        continuar.setOnClickListener {

            val intent = Intent( this@Primeralista, Plan::class.java)

            startActivity(intent)
        }

    }
}
