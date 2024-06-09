// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino,
// M - Masculino, Sexo Inválido.

fun main() {
    print("Digite seu sexo F - Femininon M - Masculino: ")
    val gender = readLine().toString()
    if (gender.uppercase() == "F") println("Feminino")
    else if (gender.uppercase() == "M") println("Masculino")
    else println("Sexo Inválido")
}