package com.example.cuidadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.habitacion.*
import java.util.*

class Habitacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.habitacion)

        leer()
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
