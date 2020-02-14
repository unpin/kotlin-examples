fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length is ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    println(describeString(null))
    println(describeString("notnull"))
}