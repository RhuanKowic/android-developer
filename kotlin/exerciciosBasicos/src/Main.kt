import java.io.File

fun main() {
    val quantArchive: Int = 28
    val content = ""
    val repository = "src/EstruturaDeDecisao"
    for (i in 1..quantArchive){
        var nameArchive = "Exercicio"

        if( i < 10) nameArchive = "Exercicio0${i}.kt"
        else nameArchive = "Exercicio${i}.kt"

        createFileKotlin(repository, nameArchive, content)
    }
}

fun createFileKotlin(repository: String,nameArchive: String, content: String){
    val diretoryFile = File(repository)
    val archive = File(diretoryFile, nameArchive)
    try {
        diretoryFile.mkdirs()
        archive.writeText(content)
        println("Arquivo $nameArchive criado com sucesso")
    } catch (ex: Exception){
        println("Ocorreu um erro ao criar o arquivo $nameArchive: ${ex.message}")
    }
}