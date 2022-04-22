package com.example.infovcbrochero20.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.infovcbrochero20.R
import com.example.infovcbrochero20.model.Lugares

class LugaresAdapter(private val lugaresList: List<Lugares>) :
    RecyclerView.Adapter<LugaresViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugaresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LugaresViewHolder(
            layoutInflater.inflate(
                R.layout.item_lugares,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LugaresViewHolder, position: Int) {
        val itemlugar = lugaresList[position]
        holder.render(itemlugar)
    }

    override fun getItemCount(): Int = lugaresList.size

}