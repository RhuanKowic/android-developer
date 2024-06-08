package EstruturaSequencial

import java.util.Scanner

// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes)
// e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na
// variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
class Exercicio14 {
}

fun main() {
    val sn: Scanner = Scanner(System.`in`)
    print("Digite o peso dos peixes: ")
    val pesoPeixe: Double = sn.nextDouble()
    if (pesoPeixe > 50){
        val multa = (pesoPeixe - 50) * 4
        println("A multa será de R$%.2f.".format(multa))
    } else {
        println("Não tem multa.")
    }

    sn.close()
}