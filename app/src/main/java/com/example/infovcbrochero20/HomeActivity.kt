package com.example.infovcbrochero20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infovcbrochero20.databinding.ActivityHomeBinding

enum class ProviderType {
    BASIC,
    GOOGLE,
}

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mbinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mbinding.root)

        mbinding.visitar.setOnClickListener(this)
        mbinding.alojamiento.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.visitar -> {
                val intent = Intent(this, RecyclerActivityLugares::class.java)
                startActivity(intent)
            }
            R.id.alojamiento -> {
                val intent = Intent(this, RecyclerActivityAlojamiento::class.java)
                startActivity(intent)
            }
            R.id.puntosdeinteres -> {
//                val intent = Intent(this, RecyclerActivityRestaurante::class.java)
//                startActivity(intent)
            }
            R.id.gastronomia -> {
//                val intent = Intent(this, RecyclerActivityGastronomia::class.java)
//                startActivity(intent)
            }
        }
    }

}




