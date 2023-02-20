fun main() {
    try {
        println(runcalc2(0))
    } catch(exp: Exception) {
        println("Opps")
        println(exp)
        println(exp.message)
        exp.printStackTrace()
    }
}

fun runcalc2(x:Int):Double {
    return 2.0 / x
}