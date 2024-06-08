package EstruturaSequencial


import java.util.Scanner

// Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as
// seguintes fórmulas:
//
//    Para homens: (72.7*h) - 58
//    Para mulheres: (62.1*h) - 44.7
class Exercicio13 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Digite sua altura: ")
    val h = sn.nextDouble()
    println("Peso ideal para homem: %.2f".format((72.7 * h) - 58))
    println("Peso ideal para mulher: %.2f".format((62.1 * h) - 44.7))
    sn.close()
}