package EstruturaSequencial

import java.util.*

// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
class Exercicio09 {
}

fun main() {
    val sn = Scanner(System.`in`)

    println("Digite a temperatura em graus Fahrenheit:")
    val fahrenheit = sn.nextDouble()
    val celsius = (fahrenheit - 32) * 5 / 9
    println("A temperatura em graus Celsius é: %.2f".format(celsius))

    sn.close()
}