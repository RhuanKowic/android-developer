package EstruturaSequencial

import java.util.Scanner

// Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
// que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.


import kotlin.math.ceil

fun calcularTinta(area: Double): Pair<Int, Double> {
    val coberturaPorLitro = 3.0
    val capacidadeLata = 18
    val precoLata = 80.0

    val litrosNecessarios = area / coberturaPorLitro
    val latasNecessarias = ceil(litrosNecessarios / capacidadeLata).toInt()

    val custoTotal = latasNecessarias * precoLata

    return Pair(latasNecessarias, custoTotal)
}

fun main() {
    print("Digite o tamanho da área a ser pintada em metros quadrados: ")
    val sn = Scanner(System.`in`)
    val area = sn.nextDouble()

    if (area > 0) {
        val (latas, custo) = calcularTinta(area)
        println("Você precisará de $latas latas de tinta.")
        println("O custo total será de R$ %.2f".format(custo))
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}
