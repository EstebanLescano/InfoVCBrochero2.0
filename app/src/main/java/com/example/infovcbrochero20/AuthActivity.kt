package com.example.infovcbrochero20
/*
* Aplicacion que tendra un splash screen de 3 segundos y una pantalla de login
*  con una imagen de fondo.
* y una pantalla con un boton de registro y un boton de inicio de sesion con
* una pantalla inicial con una imagen de fondo y una barra de navegacion con varios botones
* que nos lleva a otras pantallas de la aplicacion.
* dende vamos a tener un recycler view con una lista de lugares donde se pueden visitar y
* una lista de lugares donde se puede hacer una reserva.
* */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.infovcbrochero20.databinding.ActivityAuthBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class AuthActivity : AppCompatActivity() {

    private lateinit var mbinding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(mbinding.root)

        setup()
    }

    private fun setup() {
        title = "Autenticacion"

        mbinding.singupbutton.setOnClickListener {
            if (mbinding.editTextEmail.text.isNotEmpty() && mbinding.editTextPassword.text.isNotEmpty()) {

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    mbinding.editTextEmail.text.toString(),
                    mbinding.editTextPassword.text.toString()
                )
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }

            }
        }
        mbinding.loginbutton.setOnClickListener {
            if (mbinding.editTextEmail.text.isNotEmpty() && mbinding.editTextPassword.text.isNotEmpty()) {

                FirebaseAuth.getInstance()
                    .signInWithEmailAndPassword(
                        mbinding.editTextEmail.text.toString(),
                        mbinding.editTextPassword.text.toString()
                    )
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            showHome(it.result?.user?.email ?: "", ProviderType.BASIC)
                        } else {
                            showAlert()
                        }
                    }

            }
        }
    }

    private fun showAlert() {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Error")
        alert.setMessage("No se pudo crear el usuario")
        alert.setPositiveButton("Ok") { dialog, which ->
            dialog.dismiss()
        }
        alert.show()
    }

    private fun showHome(email: String, provider: ProviderType) {
        val homeIntent = Intent(this, HomeActivity::class.java).apply {
            putExtra("email", email)
            putExtra("provider", provider.name)
        }
        startActivity(homeIntent)
    }
}



