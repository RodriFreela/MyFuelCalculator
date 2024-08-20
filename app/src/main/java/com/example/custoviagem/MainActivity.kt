package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // criar variavel pra receber preço combustível
        // variavel pra receber consumo
        // variavel pra receber a distancia
        // variavel "litros" pra receber calculo distancia/consumo
        // varivel pra receber calculo (litros*preço)

        val btnIniciar = findViewById<Button>(R.id.iniciar)
        btnIniciar.setOnClickListener {
            val intent = Intent(this, precio_combustible::class.java)
            startActivity(intent)
        }

    }
}
