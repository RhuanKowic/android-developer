fun eatACake () = println("Ear a Cake")
fun bakeACake() = println("Bake a Cake")
fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0

    while(cakesEaten < 5){
        eatACake()
        cakesEaten++
    }

    do{
        bakeACake()
        cakesBaked++
    }while ( cakesBaked < cakesEaten)
    
    println("cakes baked: $cakesBaked")
    println("cakes eaten: $cakesEaten")
}