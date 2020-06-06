package com.example.cuidadores

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.listaespacios.*

class Listaespacios : AppCompatActivity() {

    private var adaptador: Adaptador4? = null
    private var lista = ArrayList<datositem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listaespacios)

        lista.add(datositem("consejos básicos sobre adecuación de la habitación", "", R.drawable.iconohabitacion))
        lista.add(datositem("consejos básicos sobre adecuación del cuarto de baño", "", R.drawable.iconobano))
        lista.add(datositem("consejos básicos sobre la vestimenta apropiada", "", R.drawable.iconoropa))
        lista.add(datositem("otros consejos básicos", "", R.drawable.iconootrosespacios))

        adaptador = Adaptador4(this, lista)
        adaptador!!.notifyDataSetChanged()
        listaa.adapter = adaptador

        val siguientea= findViewById<Button>(R.id.button7)
        val atras= findViewById<Button>(R.id.btn1)

        siguientea.setOnClickListener {

            val intent = Intent( this@Listaespacios, Habitacion::class.java)

            startActivity(intent)
        }

        atras.setOnClickListener {

            val intent = Intent( this@Listaespacios, Pacientelista::class.java)

            startActivity(intent)
        }

    }
}