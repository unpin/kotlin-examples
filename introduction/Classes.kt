class Customer

class Contact(val id: Int, var email: String)

fun main() {
    // val customer = Customer()
    val contact = Contact(1, "a@b.c")
    println(contact.id)
    contact.email="d@f.g"
    println(contact.email)
}