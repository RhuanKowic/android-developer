package EstruturaSequencial
import java.util.Scanner;


// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
class Exercicio04 {
}

fun main() {
    val sn = Scanner(System.`in`)
    print("Digite a primeira nota: ")
    val noteOne: Double = sn.nextDouble()

    print("Digite a segunda nota: ")
    val noteTwo: Double = sn.nextDouble()

    print("Digite a terceira nota: ")
    val noteThree: Double = sn.nextDouble()

    print("Digite a quarta nota: ")
    val noteFour: Double = sn.nextDouble()

    val average: Double = (noteOne + noteTwo + noteThree + noteFour) / 4

    println("A média das 4 notas são: ${round(average, 2)}.")
    sn.close()
}
fun round(number: Double, decimal: Int) : String{
    return "%.${decimal}f".format(number)
}