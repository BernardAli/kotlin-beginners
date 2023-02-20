open class Base {
    open fun print():Unit = println("Base")
}


class Derived: Base() {
    override fun print() {
        println("Before Base")
        super.print()
        println("After Base")
    }
}

fun main() {
    val checkBase = Derived()
    checkBase.print()
}