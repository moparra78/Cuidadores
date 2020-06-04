package com.example.cuidadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import kotlinx.android.synthetic.main.elementolista1.view.*


class Adaptador1 : BaseAdapter{
    var items = ArrayList<datositem>()
    var contexto: Context

    constructor(context: Context, items: ArrayList<datositem>) : super(){
        this.contexto = context
        this.items = items
    }

    override fun getCount(): Int {
        return items.size }

    override fun getItem(position: Int): Any {
        return items[position] }

    override fun getItemId(position: Int): Long {
        return position.toLong() }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var datos= this.items[position]
        var inflator = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var inflatordato = inflator.inflate(R.layout.elementolista1, null)

        inflatordato.icono1.setImageResource(datos.icono!!)
        inflatordato.titulo1.text = datos.titulo!!
        inflatordato.descripcion1.text = datos.descripcion!!
        return inflatordato

        /*inflatordato.setOnClickListener{
            val intent = Intent(contexto, Antiguedad::class.java)

            contexto!!.startActivity(intent)

        }*/

    }

}


/*
class Adaptador1(
    var contexto: Context,
    var datos1: Array<Array<String>>,
    var datosicono1: IntArray
) :
    BaseAdapter() {
    override fun getView(
        i: Int,
        convertView: View,
        parent: ViewGroup
    ): View {
        val vista =
            inflater!!.inflate(R.layout.elementolista1, null)
        val titulo = vista.findViewById<View>(R.id.titulo1) as TextView
        val descripcion =
            vista.findViewById<View>(R.id.descripcion1) as TextView
        val icono =
            vista.findViewById<View>(R.id.icono1) as ImageView
        titulo.text = datos1[i][0]
        descripcion.text = datos1[i][1]
        icono.setImageResource(datosicono1[i])
        /*
        icono.setTag(i);
        icono.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent visoricono = new Intent(contexto, Visoricono.class);
                visoricono.putExtra("IMG", datosicono1[(Integer)v.getTag()]);
                contexto.startActivity(visoricono);
            }

        });*/return vista
    }

    override fun getCount(): Int {
        return datosicono1.size
    }

    override fun getItem(position: Int): Any {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    companion object {
        private var inflater: LayoutInflater? = null
    }

    init {
        inflater =
            contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }
}
 */