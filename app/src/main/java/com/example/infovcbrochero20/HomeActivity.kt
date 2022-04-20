package com.example.infovcbrochero20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.infovcbrochero20.adapter.LugaresAdapter
import com.example.infovcbrochero20.databinding.ActivityHomeBinding
import com.example.infovcbrochero20.model.LugaresProvider

enum class ProviderType {
    BASIC,
    GOOGLE,
}

class HomeActivity : AppCompatActivity() {

    private lateinit var mbinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mbinding.root)
        btnvisitar()

    }

    private fun btnvisitar() {
        mbinding.visitar.setOnClickListener {
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewLugares)
            recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
            recyclerView.adapter = LugaresAdapter(LugaresProvider.lugaresList)

        }

    }


}


