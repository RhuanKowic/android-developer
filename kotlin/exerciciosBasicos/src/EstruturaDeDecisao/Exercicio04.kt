// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
fun main() {
    print("Digite uma letra: ")
    val letra = readLine().toString()

    if(letra.length == 1){
        if (isVogal(letra)) println("Vogal")
        else println("Consoante")
    } else println("Digite só uma letra")

}

fun isVogal(letra: String) :Boolean{
    val vogais = listOf("A", "E", "I", "O", "U")
    var result: Boolean = false
    for (vogal in vogais){
        if (vogal == letra.uppercase()) result = true
    }
    return result
}