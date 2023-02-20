object MathUtils {
    // Specifying useful member properties
    const val ZERO = 0
    const val min:Int = -100

    // Member property to be initialised in init block
    val MAX: Int

    // Initialisation block
    init {
        MAX = 100
    }

    fun add(x:Int, y:Int) = x + y
    fun sub(x:Int, y:Int) = x - y
    fun isLessThanMax(x: Int) = x < MAX
}

object Session{
    val id:Int = 5

    override fun toString(): String {
        return "Session($id)"
    }

}


fun main() {
    println(MathUtils.MAX)
    println(MathUtils.sub(20, 90))
    println(MathUtils.add(20, 90))
    println(MathUtils.isLessThanMax(101))

    println(Session)
    val s:Session = Session
    println(s)

    val obj = object {
        var x: Int = 0
        val y = 42
        val MAX: Int
        init {
            MAX = 100
        }
        fun printMe() {
            println("Print Me")
        }
    }
    println(obj)
    println(obj.MAX)
}