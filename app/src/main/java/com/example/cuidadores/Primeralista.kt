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


        val siguiente= findViewById<Button>(R.id.btnsiguiente2)

        siguiente.setOnClickListener {

            val intent = Intent( this@Primeralista, Antiguedad::class.java)

            startActivity(intent)    }


    }
}
