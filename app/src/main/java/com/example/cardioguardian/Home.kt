package com.example.cardioguardian

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }
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
        val noticiasbtn: ImageButton = findViewById<ImageButton>(R.id.imageButton8)

        noticiasbtn.setOnClickListener {
            val intent = Intent(this, noticias::class.java)
            startActivity(intent)
        }

        val consejosbtn: ImageButton = findViewById<ImageButton>(R.id.imageButton7)

        consejosbtn.setOnClickListener {
            val intent = Intent(this, Concejos::class.java)
            startActivity(intent)
        }
    }
}