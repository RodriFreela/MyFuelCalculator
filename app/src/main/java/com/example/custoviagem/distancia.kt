package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

const val KEY_CONSUMO = "ChaveConsumo"
const val KEY_COMBUSTIVEL = "ChaveCombustivel"

class distancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)

        val getConsumo = intent.getFloatExtra(KEY_CONSUMO, 0f) // pegar "consumo" da activity consumo
        val getCombustivel = intent.getFloatExtra(KEY_COMBUSTIVEL , 0f) //pegar preço do combustivel da activity precio_combustivel

        val edtdistancia = findViewById<TextInputEditText>(R.id.edt_distancia) // recuperar valor edt_distancia


        val calcular = findViewById<Button>(R.id.btn_Calcular) // recuperar botão calcular
        calcular.setOnClickListener {
            val distancia: Float = edtdistancia.text.toString().toFloat()

            val litros: Float = distancia / getConsumo
            println("Litros consumidos:" + litros)

            val resultadoFinal: Float = getCombustivel * litros
            println("Resusltado:" + resultadoFinal)

            // println("Distancia:" + distancia)

            val resultado = Intent(this, resultado::class.java)
            intent.putExtra("ChaveDistancia" , resultadoFinal)
            startActivity(resultado)
        }
    }
}