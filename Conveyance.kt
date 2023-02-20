abstract class Conveyance {
    protected var fuel = 5.0
    private var running = false

    fun startup() {
        running = true
        consumeFuel()
        while (fuel > 0){
            consumeFuel()
        }
        running = false
    }

    abstract fun consumeFuel()

    abstract fun drive(distance:Int):Boolean
}


class Car : Conveyance() {
    override fun consumeFuel() {
        fuel -= 1.0
        println("consuming, ")
    }
    override fun drive(distance: Int): Boolean {
        println("Driven $distance")
        return true
    }
}

fun main() {
    val c: Conveyance = Car()
    c.startup()
    val result = c.drive(10)
    println(result)
}