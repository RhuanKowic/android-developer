package EstruturaSequencial
// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
// que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//
//    Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//    comprar apenas latas de 18 litros;
//    comprar apenas galões de 3,6 litros;
//    misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os
//    valores para cima, isto é, considere latas cheias.

import kotlin.math.ceil
import kotlin.math.ceil

import kotlin.math.ceil

import kotlin.math.ceil

fun main() {
    print("Digite o tamanho da área a ser pintada em metros quadrados: ")
    val area = readLine()?.toDoubleOrNull()

    if (area != null) {
        val coberturaPorLitro = 6.0
        val capacidadeLata = 18.0
        val capacidadeGalao = 3.6
        val precoLata = 80.0
        val precoGalao = 25.0
        val areaComFolga = area * 1.1
        val litrosNecessarios = areaComFolga / coberturaPorLitro

        val latasNecessarias = ceil(litrosNecessarios / capacidadeLata).toInt()
        val custoLatas = latasNecessarias * precoLata

        val galoesNecessarios = ceil(litrosNecessarios / capacidadeGalao).toInt()
        val custoGaloes = galoesNecessarios * precoGalao

        val latasMix = (litrosNecessarios / capacidadeLata).toInt()
        val restanteLitros = litrosNecessarios - (latasMix * capacidadeLata)
        val galoesMix = ceil(restanteLitros / capacidadeGalao).toInt()
        val custoMix = (latasMix * precoLata) + (galoesMix * precoGalao)

        println("Apenas latas de 18 litros: $latasNecessarias latas, custo total: R$ %.2f".format(custoLatas))
        println("Apenas galões de 3,6 litros: $galoesNecessarios galões, custo total: R$ %.2f".format(custoGaloes))
        println("Misturar latas e galões: $latasMix latas e $galoesMix galões, custo total: R$ %.2f".format(custoMix))
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}
