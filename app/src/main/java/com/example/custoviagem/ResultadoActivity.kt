package com.example.custoviagem

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

const val KEY_DISTANCIA = "ChaveDistancia"

class ResultadoActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)

        val resultadoFinal = intent.getFloatExtra("ResultadoFinal", 0.1f)
        val distancia = intent.getFloatExtra(KEY_DISTANCIA , 0.1f)
        val consumo = intent.getFloatExtra(KEY_CONSUMO , 0.1f)
        val price = intent.getFloatExtra(KEY_PRICE , 0.1f)
        val litrosFinal = intent.getFloatExtra("LitrosFinal" , 0.1f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        tvResult.text = "$ " + (resultadoFinal.toString())

        val tvPriceFinal = findViewById<TextView>(R.id.tv_priceFinal)
        tvPriceFinal.text = "$ " + (price.toString())

        val edtLitros: TextView = findViewById<TextView>(R.id.edt_litros)
        edtLitros.text = (litrosFinal.toString()) + " L"


        val tvConsumoFinal = findViewById<TextView>(R.id.tv_consumoFinal)
        tvConsumoFinal.text = (consumo.toString()) + " km/L"

        val tvdistanciaFinal = findViewById<TextView>(R.id.tv_distanciaFinal)
        tvdistanciaFinal.text = (distancia.toString()) + " km"


        val novoCalculo = findViewById<Button>(R.id.btn_calculo)
        novoCalculo.setOnClickListener {
            val mainScreen = Intent(this, MainActivity::class.java)
            startActivity(mainScreen)
        }
    }
}