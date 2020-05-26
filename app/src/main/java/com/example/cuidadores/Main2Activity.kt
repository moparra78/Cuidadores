package com.example.cuidadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.SharedPreferences
import android.widget.Button
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private var adaptador: Adaptador1? = null
    private var lista = ArrayList<datositem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        lista.add(datositem("Antiguedad", "Tiempo de padecimiento", R.drawable.iconoantiguedad))
        lista.add(datositem("Fase", "Estado de la enfermedad", R.drawable.iconofase))
        lista.add(datositem("Medicación", "Medicamentos que ingiere", R.drawable.iconomedicacion))

        adaptador = Adaptador1(this, lista)
        adaptador!!.notifyDataSetChanged()
        listaa.adapter = adaptador


    }
}
