package timers
import java.math.BigInteger
import kotlin.system.measureTimeMillis


val cache = mutableMapOf<BigInteger, BigInteger>()
val BigIntegerZero = 0.toBigInteger()
val OneBigInteger = 1.toBigInteger()
fun timer(func: (BigInteger) -> BigInteger?,
          parameter: BigInteger) {
    println("Starting to execute function for $parameter")
    val timeInMillis = measureTimeMillis {
        func(parameter)
    }
    println("The function took $timeInMillis ms")
}
fun factorial(number: BigInteger): BigInteger? {
    return if (number < BigIntegerZero) {
        null
    } else if (number == BigIntegerZero) {
        cache[number] = OneBigInteger
        OneBigInteger
    } else {
        var factorial = OneBigInteger
        var i = OneBigInteger
        while (i.compareTo(number) == -1) {
            factorial *= i
            i = i.inc()
        }
        cache[number] = factorial
        factorial
    }
}
fun main() {
    println("Starting timer test")
    timer(::factorial, 25000.toBigInteger())
    timer(::factorial, 25000.toBigInteger())
    timer(::factorial, 50000.toBigInteger())
    timer(::factorial, 50000.toBigInteger())
    timer(::factorial, 150000.toBigInteger())
    timer(::factorial, 150000.toBigInteger())
    println("Done")
}