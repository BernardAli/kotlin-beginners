data class Quantity(val value: Int) {

    operator fun plus(other: Quantity): Quantity =
        Quantity(value + other.value)

    operator fun minus(other: Quantity): Quantity =
        Quantity(value - other.value)

    operator fun plus(increment: Int): Quantity =
        Quantity(value + increment)

    operator fun minus(decrement: Int): Quantity =
        Quantity(value - decrement)

    infix fun add(i: Int): Quantity = Quantity(value + i)
    infix fun sub(i: Int): Quantity = Quantity(value - +i)

}

fun main() {
    val q1 = Quantity(5)
    val q2 = Quantity(10)
    println("q1 = $q1, q2 = $q2")

    val q3 = q1 + q2
    println("q3 = $q3")

    val q4 = q3 + 7
    println("q4 = $q4")

    println("q1 add 5: ${q1 add 5}")
    println("q1 sub 5: ${q1 sub 5}")
}