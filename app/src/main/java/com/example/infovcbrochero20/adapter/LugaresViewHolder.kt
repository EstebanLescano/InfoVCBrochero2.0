package com.example.infovcbrochero20.adapter

import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.infovcbrochero20.model.Lugares

class LugaresViewHolder(view: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {

    private val mbinding = com.example.infovcbrochero20.databinding.ItemLugaresBinding.bind(view)

    fun render(lugarmodel: Lugares) {
        mbinding.tvLugaresNombres.text = lugarmodel.nombre
        mbinding.tvLugaresDescripcion.text = lugarmodel.descripcion
        mbinding.tvLugaresServicios.text = lugarmodel.servicios
        Glide.with(mbinding.ivLugares.context).load(lugarmodel.imagen)
            .into(mbinding.ivLugares) //cargar imagen con glide
        mbinding.ivLugares.setOnClickListener {
            Toast.makeText(
                mbinding.ivLugares.context,
                "Click en ${lugarmodel.nombre}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}

