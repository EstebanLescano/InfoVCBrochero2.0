package com.example.infovcbrochero20.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.infovcbrochero20.model.Alojamientos
import com.example.infovcbrochero20.databinding.ItemAlojamientosBinding

class AlojamientosViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val mbinding = ItemAlojamientosBinding.bind(view)

   fun render(alojamientoModel: Alojamientos) {
        mbinding.tvName.text = alojamientoModel.nombre
        mbinding.tvdescripcion.text = alojamientoModel.descripcion
        mbinding.tvubicacion.text = alojamientoModel.ubicacion
       Glide.with(mbinding.ivPhoto.context)
           .load(alojamientoModel.imagen)
           .into(mbinding.ivPhoto)

    }
}
// End of file