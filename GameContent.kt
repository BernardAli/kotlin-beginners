data class GameContent(val x:Double, val y:Double)

data class Ship(val x: Double,
                val y: Double) {
    // following property is not used by
    // toString, equals, hashcode etc.
    var image: String = "ship.png"
}

fun main() {
    val inst1 = GameContent(10.0, 10.0)
    println(inst1)

    val inst2 = GameContent(10.0, 10.0)
    println(inst2)
    println("x: ${inst2.x}, obj2.y: ${inst2.y}")

    println(inst1 == inst2)
    println(inst1.hashCode())
    println(inst2.hashCode())

    val ship1 = Ship(10.0, 10.0)
    ship1.image = "default.png"
    println("ship1: $ship1")

    // copying
    val otherShip = ship1.copy(x = 20.0)
    println("othership: $otherShip")
    println("otherShip.image: ${otherShip.image}")

    // destructuring
    val (x, y) = ship1
    println("x $x, y $y")

}