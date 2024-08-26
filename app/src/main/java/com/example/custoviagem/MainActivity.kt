package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // criar variavel pra receber preço combustível
        // variavel pra receber ConsumoActivity
        // variavel pra receber a distancia
        // variavel "litros" pra receber calculo distancia/ConsumoActivity
        // varivel pra receber calculo (litros*preço)

        val btnIniciar = findViewById<Button>(R.id.iniciar)
        btnIniciar.setOnClickListener {
            val intent = Intent(this, PriceActivity::class.java)
            startActivity(intent)
        }

    }
}
