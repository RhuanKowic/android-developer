fun main() {
    with(configuration) {
        println("$host:$port")
    }

// instead of:
    println("${configuration.host}:${configuration.port}")
}
