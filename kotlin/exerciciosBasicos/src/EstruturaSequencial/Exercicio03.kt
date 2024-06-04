package EstruturaSequencial
// Faça um Programa que peça dois números e imprima a soma.
class Exercicio03 {
}

fun main() {
    print("Digite o primeiro número: ")
    val numberOne = readLine();
    print("Digite o segundo número: ")
    val numberTwo = readLine();

    val soma = (numberTwo?.toInt() ?: 0) + (numberOne?.toInt() ?: 0)
    println("A soma de $numberOne + $numberTwo = $soma")
}