package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_PRICE = "PriceCombustivel"

class ConsumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val price = intent.getFloatExtra(KEY_PRICE, 0.1f)

        val edtconsumo = findViewById<TextInputEditText>(R.id.edt_consumo)


        val btnProximo2 = findViewById<Button>(R.id.proximo2)
        btnProximo2.setOnClickListener {
            val consumoStr = edtconsumo.text.toString()

            if (consumoStr == "") {
                Snackbar
                    .make(
                        edtconsumo,
                        "Consumo obrigatório",
                        Snackbar.LENGTH_LONG
                    ).show()
            } else {
                val consumo: Float = consumoStr.toFloat()
                println("Consumo:" + consumo)

                val intentDistancia = Intent(this, distancia::class.java)
                    .apply {
                        putExtra(KEY_CONSUMO, consumo)
                        putExtra(KEY_PRICE, price)
                    }
                startActivity(intentDistancia)
            }
        }
    }
}