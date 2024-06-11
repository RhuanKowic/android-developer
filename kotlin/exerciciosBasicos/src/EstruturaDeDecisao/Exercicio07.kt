// Faça um Programa que leia três números e mostre o maior e o menor deles.

fun main() {
    print("Digite um número: ")
    val one: Int? = readLine()?.toIntOrNull()
    print("Digite um número: ")
    val two: Int? = readLine()?.toIntOrNull()
    print("Digite um número: ")
    val three: Int? = readLine()?.toIntOrNull()

    if (one != null && two != null && three != null){
        if (one > two && one > three) println(one)
        else if (two > one && two > three) println(two)
        else println(three)
        if (one < two && one < three) println(one)
        else if (two < one && two < three) println(two)
        else println(three)
    } else println("Digite valor valido.")
}
