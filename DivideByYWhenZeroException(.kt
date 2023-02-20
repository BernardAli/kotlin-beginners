class DivideByYWhenZeroException(
    message: String = "",
    cause: Throwable? = null): Exception(message, cause)


fun divide2(x: Int, y: Int): Int {
    try {
        return x / y
    } catch (exp: ArithmeticException) {
        throw DivideByYWhenZeroException("Divide by Zero", exp)
    }
}

fun main() {
    println(divide2(6, 0))
}