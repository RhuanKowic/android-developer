package EstruturaSequencial

// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
public class Exercicio18 {
}
fun main() {
    print("Digite o tamanho do arquivo para download (em MB): ")
    val tamanhoArquivo = readLine()?.toDoubleOrNull()

    print("Digite a velocidade do link de Internet (em Mbps): ")
    val velocidadeLink = readLine()?.toDoubleOrNull()

    if (tamanhoArquivo != null && velocidadeLink != null) {
        val tempoSegundos = (tamanhoArquivo * 8) / velocidadeLink
        val tempoMinutos = tempoSegundos / 60
        println("O tempo aproximado de download é de %.2f minutos".format(tempoMinutos))
    } else {
        println("Entrada inválida. Por favor, insira valores numéricos válidos.")
    }
}
