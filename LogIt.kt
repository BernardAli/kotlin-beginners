open class LogIt {
    fun log() = println("log")
}

fun main() {
    val obj = object : LogIt() {
        var x: Int = 0
        val y = 42
    }

    println(obj.x)
    println(obj.y)
    obj.log()
}