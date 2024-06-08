package EstruturaSequencial

import java.util.Scanner

// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
// salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
// faça um programa que nos dê:
//
//    salário bruto.
//    quanto pagou ao INSS.
//    quanto pagou ao sindicato.
//    o salário líquido.
//    calcule os descontos e o salário líquido, conforme a tabela abaixo:
class Exercicio15 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Digite quanto você ganha por hora: ")
    val horaSalario = sn.nextDouble()
    print("Digite quantas horas trabalha por mês: ")
    val horasMes = sn.nextInt()

    val salarioBruto = horaSalario * horasMes
    println("Salario bruto: R$%.2f".format(salarioBruto))

    val inss = salarioBruto * 0.08
    println("Pagou R$%.2f de INSS.".format(inss))

    val sindicato = salarioBruto * 0.05
    println("Pagou R$%.2f de sindicato".format(sindicato))

    val salarioLiquido = salarioBruto * 0.76
    println("O seu salario liquido é: R$%.2f".format(salarioLiquido))
}