class Rational(val numerator: Int, d: Int) {
    val denominator: Int
    init {
        if (d == 0)
            throw RuntimeException(
                "Denominator cannot be Zero")
        denominator = d
    }
    override fun toString()=
        "Rational($numerator, $denominator)"
}
fun main() {
    val result = try {
        Rational(5, 2)
    } catch (exp: RuntimeException) {
        Rational(5, 1)
    }
    println(result)
}