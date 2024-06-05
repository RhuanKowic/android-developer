package EstruturaSequencial

import java.util.Scanner

// Faça um Programa que converta metros para centímetros.
class Exercicio05 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Digite quantos metros que será convertido em cm: ")
    val metros: Double = sn.nextDouble()
    val centimetros: Double = metros * 100

    println("$metros metros convertido em centimetros da: $centimetros cm.")
    sn.close()
}