val systemUser: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUser

fun addSystemUser(newUser: Int){
    systemUser.add(newUser)
}

fun getSysSudoers(): List<Int>{
    return sudoers
}
fun main() {
    addSystemUser(4)
    println("tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach{
        i -> println("SOme useful info on user $i")
    }
}