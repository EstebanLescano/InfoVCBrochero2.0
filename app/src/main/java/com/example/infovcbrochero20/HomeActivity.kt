package com.example.infovcbrochero20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infovcbrochero20.databinding.ActivityHomeBinding
import com.google.firebase.auth.FirebaseAuth

enum class ProviderType {
        BASIC,
        GOOGLE,
        FACEBOOK
}

class HomeActivity : AppCompatActivity() {

    private lateinit var mbinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mbinding.root)

        val bundle = intent.extras
        val email = bundle?.getString("email")
        val saludo = ("Hola $email")
        setup(email?:"", saludo?: "")
    }

    private fun setup(email: String, saludo: String) {
        title = "Inicio"
        mbinding.textViewEmail.text = email
        mbinding.textViewSaludo.text = saludo

        mbinding.logoutbutton.setOnClickListener {//Logout button
            FirebaseAuth.getInstance().signOut()
            onBackPressed()//vuelve a la pantalla anterior
        }
    }
}