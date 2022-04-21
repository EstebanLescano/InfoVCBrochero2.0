package com.example.infovcbrochero20.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.infovcbrochero20.model.Alojamientos
import com.example.infovcbrochero20.R

class AlojamientosAdapter(private val AlojamientosList: List<Alojamientos>) :
    RecyclerView.Adapter<AlojamientosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlojamientosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlojamientosViewHolder(
            layoutInflater.inflate(
                R.layout.item_alojamientos,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AlojamientosViewHolder, position: Int) {
        val item = AlojamientosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = AlojamientosList.size

}
