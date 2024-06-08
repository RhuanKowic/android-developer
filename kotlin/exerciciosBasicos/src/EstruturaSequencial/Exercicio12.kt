package EstruturaSequencial

import java.util.Scanner

// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
class Exercicio12 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    println("Digite sua altura: ")
    val altura: Double = sn.nextDouble()
    val pesoIdeal = (72.7 * altura) - 58
    println("Seu peso ideal é: %.2f".format(pesoIdeal))
    sn.close()
}
