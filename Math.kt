class Maths {

    fun factorial(x:Int):Int {
        if (x <= 1){
            return 1
        } else {
            return x * factorial(x - 1)
        }
    }

    fun max(x:Int, y:Int):Int {
        return if (x > y) x else y
    }

}

fun main() {
    val check = Maths()

    println(check.factorial(10))
    println(check.max(12, 99))
}