fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int): Int = x*y

fun main() {
    printMessage("hello")
    printMessageWithPrefix("hello", "log")
    printMessageWithPrefix("hello")
    printMessageWithPrefix(prefix="log", message ="hello")
    println(sum(1, multiply(2, 3)))
}