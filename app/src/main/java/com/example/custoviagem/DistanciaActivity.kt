package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_CONSUMO = "ChaveConsumo"


class distancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)

        val consumo = intent.getFloatExtra(KEY_CONSUMO, 0.1f) // pegar "ConsumoActivity" da activity ConsumoActivity
        val price = intent.getFloatExtra(KEY_PRICE, 0.1f) //pegar preço do combustivel da activity precio_combustivel

        val edtdistancia = findViewById<TextInputEditText>(R.id.edt_distancia) // recuperar valor edt_distancia


        val calcular = findViewById<Button>(R.id.btn_Calcular) // recuperar botão calcular
        calcular.setOnClickListener {
            val distanciaStr: String = edtdistancia.text.toString()

            if (distanciaStr == "") {
                Snackbar
                    .make(
                        edtdistancia,
                        "Distancia obrigatória",
                        Snackbar.LENGTH_LONG
                    ).show()
            } else {
                val distancia: Float = distanciaStr.toFloat()
                println("Distancia:" + distancia)

                val litros: Float = (distancia * consumo) / 100
                println("Litros consumidos:" + litros)

                val resultadoFinal: Float = price * litros
                println("Resultado:" + resultadoFinal)



                val resultado = Intent(this, ResultadoActivity::class.java)
                    .apply {
                        putExtra(KEY_DISTANCIA, distancia)
                        putExtra("ResultadoFinal", resultadoFinal)
                        putExtra(KEY_CONSUMO, consumo)
                        putExtra(KEY_PRICE, price)
                        putExtra("LitrosFinal" , litros)
                    }
                startActivity(resultado)

            }
        }
    }
}