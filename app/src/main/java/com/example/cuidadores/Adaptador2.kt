package com.example.cuidadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import kotlinx.android.synthetic.main.elementolista2.view.*


class Adaptador2 : BaseAdapter{
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
        var inflatordato = inflator.inflate(R.layout.elementolista2, null)

        inflatordato.icono1.setImageResource(datos.icono!!)
        inflatordato.titulo1.text = datos.titulo!!
        inflatordato.descripcion1.text = datos.descripcion!!
        return inflatordato

    }

}
