package com.example.infovcbrochero20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.infovcbrochero20.adapter.LugaresAdapter
import com.example.infovcbrochero20.databinding.ActivityRecyclerLugaresBinding
import com.example.infovcbrochero20.model.LugaresProvider

class RecyclerActivityLugares : AppCompatActivity() {

    private lateinit var mbinding: ActivityRecyclerLugaresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityRecyclerLugaresBinding.inflate(layoutInflater)
        setContentView(mbinding.root)

        initRecycler()
    }

    private fun initRecycler() {
        mbinding.recyclerViewLugares.layoutManager = LinearLayoutManager(this)
        mbinding.recyclerViewLugares.adapter = LugaresAdapter(LugaresProvider.lugaresList)

    }

}