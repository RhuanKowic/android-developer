// Faça um Programa que peça dois números e imprima o maior deles.

fun main() {
    print("Digite o primeiro número: ")
    val numberOne = readLine()?.toIntOrNull()

    print("Digite o segundo número: ")
    val numberTwo = readLine()?.toIntOrNull()

    if (numberOne != null && numberTwo != null){
        if (numberOne > numberTwo) println(numberOne)
        else println(numberTwo)
    } else println("Digite um número inteiro.")
}