package EstruturaSequencial

import java.util.*

// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
class Exercicio10 {
}

fun main() {
    val sn = Scanner(System.`in`)
    println("Digite a temperatura em graus Celsius:")
    val celsius = sn.nextDouble()
    val fahrenheit = (celsius * 9 / 5) + 32
    println("A temperatura em graus Fahrenheit é: %.2f".format(fahrenheit))

    sn.close()
}