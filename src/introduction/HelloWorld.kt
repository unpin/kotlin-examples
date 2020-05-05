package introduction

class Greeter(val name: String = "Steve") {
    fun greet() {
        println(" $name")
    }
}

fun main() {
    println("Hello")
    Greeter().greet()
}
