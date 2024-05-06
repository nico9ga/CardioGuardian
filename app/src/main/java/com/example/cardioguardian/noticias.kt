package com.example.cardioguardian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge

class noticias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_noticias)
        val casabtn: ImageButton = findViewById<ImageButton>(R.id.casa)

        casabtn.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val agregarBtn : ImageButton = findViewById<ImageButton>(R.id.Agregar)
        agregarBtn.setOnClickListener {
            val intent = Intent(this, modeloCardiaco::class.java)
            startActivity(intent)
        }
        val sirena: ImageButton = findViewById<ImageButton>(R.id.Sirena)

        sirena.setOnClickListener{
            val intent = Intent(this, Emergencias::class.java)
            startActivity(intent)
        }
    }
}