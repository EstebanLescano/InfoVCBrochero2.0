package com.example.infovcbrochero20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       startActivity(Intent(this, AuthActivity::class.java))
        finish()
    }
}