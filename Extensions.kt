// Extension Functions

fun String.hasLength(len: Int) = this.length == len

fun String.mult(len: Int): String {
    var result: String = ""
    for (i in 0..len) {
        result += this
    }
    return result
}

// Extension Properties
val String.size get() = this.length

// Infix Extension Operators
infix fun String.m(len: Int): String {
    var result: String = ""
    for (i in 0..len) {
        result += this
    }
    return result
}

fun main() {
    val s = "John"
    println("s.hasLength(4): ${s.hasLength(4)}")
    println("-".mult(25))

    println("s.size: ${s.size}")
    println(s.length)

    // Infix operator example
    println("-" m 25)
    // same as
    println("-".m(25))
}