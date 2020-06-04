package com.example.cuidadores

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.segundalista.*

class Segundalista : AppCompatActivity() {

    private var adaptador: Adaptador2? = null
    private var lista = ArrayList<datositem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segundalista)

        lista.add(datositem("Sobre el paciente", "Adecuación de espacios, rutinas y consejos para el cuidado", R.drawable.iconopaciente))
        lista.add(datositem("Sobre el cuidador", "Gestión de bienestar", R.drawable.iconocuidador))

        adaptador = Adaptador2(this, lista)
        adaptador!!.notifyDataSetChanged()
        listaa.adapter = adaptador

        val siguiente= findViewById<Button>(R.id.btn1)

        siguiente.setOnClickListener {

            val intent = Intent( this@Segundalista, Pacientelista::class.java)

            startActivity(intent)    }


    }
}
