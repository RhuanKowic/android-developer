val openIssus: MutableSet<String> = mutableSetOf("Descr1", "Descr2", "Descr3")

fun addIssue( desc: String): Boolean{
    return openIssus.add(desc)
}

fun getStatus(isAdded: Boolean): String{
    return if (isAdded) "Registered correctly." else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue: String = "descr4"
    val anIssueALreadyIn: String = "Descr1"
    println(getStatus(addIssue(aNewIssue)))
    println(getStatus(addIssue(anIssueALreadyIn)))
}