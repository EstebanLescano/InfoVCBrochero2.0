package com.example.infovcbrochero20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.infovcbrochero20.adapter.AlojamientosAdapter
import com.example.infovcbrochero20.databinding.ActivityRecyclerAlojamientoBinding
import com.example.infovcbrochero20.model.AlojamientosProvider

class RecyclerActivityAlojamiento : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerAlojamientoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerAlojamientoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerAlojamientos()

    }

    private fun initRecyclerAlojamientos() {
        binding.recyclerAlojamientos.layoutManager = LinearLayoutManager(this)
        binding.recyclerAlojamientos.adapter = AlojamientosAdapter(AlojamientosProvider.AlojamientosList)
    }
}