package EstruturaSequencial

import java.util.Scanner

// Faça um Programa que pergunte quanto você ganha por hora e
// o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
class Exercicio08 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Quanto você recebe por hora: R$")
    val salaryHour = sn.nextDouble()

    print("Quantas horas você trabalha por mês: ")
    val hours = sn.nextInt()

    val salaryMonth = salaryHour * hours
    println("Vocẽ receba R$${round(salaryMonth, 2)} por mês.")
}