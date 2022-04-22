package com.example.infovcbrochero20.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.infovcbrochero20.databinding.ItemLugaresBinding
import com.example.infovcbrochero20.model.Lugares


class LugaresViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val mbinding = ItemLugaresBinding.bind(view)

    fun render(lugarmodel: Lugares) {
        mbinding.tvLugaresNombres.text = lugarmodel.nombre
        mbinding.tvLugaresDescripcion.text = lugarmodel.descripcion
        mbinding.tvLugaresServicios.text = lugarmodel.servicios
        Glide.with(mbinding.ivLugares.context)
            .load(lugarmodel.imagen)
            .into(mbinding.ivLugares) //cargar imagen con glide

    }
}//end class

