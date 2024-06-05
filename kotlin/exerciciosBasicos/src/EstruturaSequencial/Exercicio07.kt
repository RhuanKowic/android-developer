package EstruturaSequencial

import java.util.Scanner

// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
class Exercicio07 {

}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Digite a base do quadrado: ")
    val b = sn.nextDouble()

    print("Digite a altura do quadrado: ")
    val a = sn.nextDouble()

    val area = a * b
    println("A area deste quadrado é: ${round(area, 1)}.")

    val dobroArea = area * 2
    println("A area dobrada do quadrado é: ${round(dobroArea, 1)}")
    sn.close()
}