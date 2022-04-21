package com.example.infovcbrochero20.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.infovcbrochero20.model.Alojamientos
import com.example.infovcbrochero20.databinding.ItemAlojamientosBinding

class AlojamientosViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemAlojamientosBinding.bind(view)

   fun render(alojamientoModel: Alojamientos) {
        binding.tvName.text = alojamientoModel.nombre
        binding.tvdescripcion.text = alojamientoModel.descripcion
        binding.tvubicacion.text = alojamientoModel.ubicacion
       Glide.with(binding.ivPhoto.context).load(alojamientoModel.imagen).into(binding.ivPhoto)

    }
}
// End of file