// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

fun main() {
    print("Digite um número: ")
    val number = readLine()?.toIntOrNull()
    if (number != null){
        if (number >= 0) println("Positivo")
        else println("Negativo")
    }
}