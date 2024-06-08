package EstruturaSequencial

import java.util.Scanner

// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//
//    o produto do dobro do primeiro com metade do segundo .
//    a soma do triplo do primeiro com o terceiro.
//    o terceiro elevado ao cubo.
class Exercicio11 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Digite o primeiro número inteiro: ")
    val intOne: Int = sn.nextInt()
    print("Digite o segundo número inteiro: ")
    val intTwo: Int = sn.nextInt()
    print("Digite o primeiro número real: ")
    val doubleThree: Double = sn.nextDouble()

    println(intOne * (intTwo / 2))
    println(intOne * 3 + doubleThree)
    println(elevadoAoCubo(doubleThree))
    sn.close()

}

fun elevadoAoCubo(number: Double): Double{
    var counter: Double = number
    for (i in 2..3) counter *= number
    return counter
}