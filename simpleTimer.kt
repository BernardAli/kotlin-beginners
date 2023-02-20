package timers
import java.math.BigInteger
import kotlin.system.measureTimeMillis


val caches = mutableMapOf<BigInteger, BigInteger>()
val BigIntegerZeros = 0.toBigInteger()
val OneBigIntegers = 1.toBigInteger()

fun timers(func: (BigInteger) -> BigInteger?,
          parameter: BigInteger) {
    println("Starting to execute function for $parameter")
    val timeInMillis = measureTimeMillis {
        func(parameter)
    }
    println("The function took $timeInMillis ms")
}

fun factorials(number: BigInteger): BigInteger? {
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
    timer(::factorial, 250000.toBigInteger())
    timer(::factorial, 250000.toBigInteger())
    timer(::factorial, 500000.toBigInteger())
    timer(::factorial, 500000.toBigInteger())
    timer(::factorial, 1500000.toBigInteger())
    timer(::factorial, 1500000.toBigInteger())
    println("Done")
}