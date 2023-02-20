fun main() {
    try {
        runcalc(5)
    } catch (exp:Exception){
        println("OOps")
        exp.printStackTrace()
    }

    try {
        runcalc(5)
    } catch (exp: NullPointerException) {
        println("NullPointerException")
    } catch (exp: IllegalArgumentException) {
        println("IllegalArgumentException")
    } catch (exp: ArithmeticException) {
        println("ArithmeticException")
        println(exp)
        println(exp.message)
        exp.printStackTrace()
    } catch (e: Exception) {
        println("Duh!")
    }

    println("Starting")
    try {
        println("Before the call to divide")
        val result = divide(6,2)
        println("After the call to divide: $result")
    } catch (exp: ArithmeticException) {
        println("Opps")
    }
    finally {
        println("Always runs")
        println("Done")
    }

    try {
        functionBang()
    } catch (exp: RuntimeException) {
        println(exp.message)
        throw exp
    }
}

fun runcalc(x: Int){
    x / 2
}


fun divide(x: Int, y: Int): Int {
    println("entering divide($x, $y)")
    val result = x / y
    println("exiting divide $result")
    return result
}

fun functionBang() {
    println("entering functionBang")
    throw RuntimeException("Bang!")
    println("exiting functionBang")
}