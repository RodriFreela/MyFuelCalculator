package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class consumo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val consumo = findViewById<TextInputEditText>(R.id.consumo)

        val btnProximo2 = findViewById<Button>(R.id.proximo2)
        btnProximo2.setOnClickListener {
            val intentDistancia = Intent(this, distancia::class.java)
            startActivity(intentDistancia)

        }
    }
}