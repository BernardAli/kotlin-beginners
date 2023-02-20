import kotlin.math.pow

fun main() {
    val func3 = ::test
    println(func3())

    val func: () -> Unit = { println("Hello World") }
    val func10 = func
    func()
    func10()

    val cube = ::cube
    println(cube(10.0))

    println(cubeReturn(40.0, cube))
    println(cubeReturn(40.0, min10))
    println(cubeReturn(40.0, increase1))

    println(cubeReturn(80.5) { a -> a * a })

    println(calculateTax(1250.0) { a-> a * 0.25})

    val isEven = makeChecker("even")
    val isPositive = makeChecker("positive")
    val isNegative = makeChecker("negative")
    val isInteger = makeChecker("")

    println("isEven = ${isEven(3)}")
    println("isPositive(3): ${isPositive(3)}")
    println("isNegative(3): ${isNegative(3)}")
    println("isInteger(3): ${isInteger(3)}")

    val func1 = makeNamedFunction()
    println("func1(3, 2): ${func1(3, 2)}")
    println("func1(3, 3): ${func1(3, 3)}")
    println("func1(3, 1): ${func1(3, 1)}")
}

fun test():String{
    return "Ben"
}

val min10 = fun(a:Double):Double{
    return a + 10
}

fun cube(a:Double): Double = a.pow(3)

val increase1 = {a:Double -> a * a}

fun cubeReturn(a:Double, cube:(Double) -> Double):Double {
    return cube(a)
}


fun calculateTax(salary: Double, taxCal:(Double) -> Double): Double{
    return taxCal(salary)
}

fun makeChecker(s: String): (Int) -> Boolean =
    when (s) {
        "even" -> { n: Int -> n % 2 == 0 }
        "positive" -> { n: Int -> n >= 0 }
        "negative" -> { n: Int -> n < 0 }
        else -> { n: Int -> true }
    }

fun makeNamedFunction(): (Int, Int) -> Int {
    fun adder(x: Int, y: Int): Int {
        return x + y
    }
    return ::adder
}