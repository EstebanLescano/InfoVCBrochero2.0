package com.example.infovcbrochero20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infovcbrochero20.databinding.ActivityHomeBinding
import com.example.infovcbrochero20.view.RecyclerActivityAlojamiento
import com.example.infovcbrochero20.view.RecyclerActivityLugares

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

        mbinding.visitar.setOnClickListener(this)//esta es la referencia al boton sino no funciona
        mbinding.alojamiento.setOnClickListener(this)//esta es la referencia al boton sino no funciona
        mbinding.puntosdeinteres.setOnClickListener(this)//esta es la referencia al boton sino no funciona
        mbinding.gastronomia.setOnClickListener(this)//esta es la referencia al boton sino no funciona

    }

    override fun onClick(vistabotones: View?) {
        when(vistabotones?.id){
            R.id.visitar -> {
                val intent = Intent(this, RecyclerActivityLugares::class.java)
                startActivity(intent)
            }
            R.id.alojamiento -> {
                val intent = Intent(this, RecyclerActivityAlojamiento::class.java)
                startActivity(intent)
            }
            R.id.puntosdeinteres -> {
//                val intent = Intent(this, RecyclerActivityPuntosDeInteres::class.java)
//                startActivity(intent)
            }
            R.id.gastronomia -> {
//                val intent = Intent(this, RecyclerActivityGastronomia::class.java)
//                startActivity(intent)
            }
        }
    }

}




