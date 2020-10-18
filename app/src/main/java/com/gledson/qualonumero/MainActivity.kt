package com.gledson.qualonumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var valor: Int = Random.nextInt(1,100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun validar(view: View) {
        if (numero.text.toString().isNotEmpty()) {

            val input: Int = numero.text.toString().toInt()

            numero.setText("")
            when {
                valor < input -> {
                    resultado.text = "O número é menor que o digitado!"
                }
                valor > input -> {
                    resultado.text = "O número é maior que o digitado!"
                }
                else -> {
                    resultado.text =
                        "Na mosca! O número era $valor! \nNovo número sorteado, tente acertar de novo!"
                    valor = (1..101).random()
                }
            }
        } else {
            resultado.text = "Informe um valor"
        }
    }

}
