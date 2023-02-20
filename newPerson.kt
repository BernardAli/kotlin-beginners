import kotlin.math.pow

class MathUtil{
    val MAX = 100
    val MIN = 0

    override fun toString(): String {
        return "Max: $MAX and Min: $MIN"
    }

    fun add(a:Int, b:Int):Int{
        return a + b
    }

    fun square(a:Int):Double {
        return  a.toDouble().pow(2)
    }
}

fun main() {
    var check = MathUtil()

    println(check.toString())
    println(check.MAX)
    println(check.add(5, 15))
    println(check.square(5))
}