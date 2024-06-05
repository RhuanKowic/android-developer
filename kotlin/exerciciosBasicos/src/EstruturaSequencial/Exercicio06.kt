package EstruturaSequencial

import java.util.Scanner

// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
class Exercicio06 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("DIgite o raio do circulo: ")
    val raio = sn.nextDouble()
    val area = Math.PI * (raio * raio)
    // Utilizou a função do exercicio04
    println("A area do circulo é ${round(area,1)}")
    sn.close()
}

