// Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//
//    A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//    A mensagem "Reprovado", se a média for menor do que sete;
//    A mensagem "Aprovado com Distinção", se a média for igual a dez.

fun main() {
    print("Digite a primeira nota: ")
    val noteOne: Double? = readLine()?.toDoubleOrNull()
    print("Digite a segunda nota: ")
    val noteTwo: Double? = readLine()?.toDoubleOrNull()
    if (noteTwo != null && noteOne != null){
        val media = (noteOne + noteTwo) / 2

        if (media == 10.0) println("Aprovado com Distinção")
        else if (media >= 7) println("Aprovado")
        else println("Reprovado")
    } else {
        println("Digite valor valido. Exemplo: 7, 8, 8,5.")
    }
}