import kotlin.math.PI
import kotlin.math.pow

fun main() {
    println("Hello World!")
    println("Please Enter your Name:")
//    val name = readLine()
    var name = "Ben Ali"
    name = "Muna"
    println("Hello $name")


    /**
     * comments
     * this *main function
     * @author Ben Ali
     * @since 2022
     * @exception
     * @see Main
     */

    // single line comment

    // Basic Types
    // Integer Types
    // Byte(8), Short(16), Int(32), Long(64)
    val worldPopulation = 7_900_000_000
    println(worldPopulation * 12)

    // Positive numbers
    // UByte, UInt, ULong
    val myAge:UByte = 255u
    println(myAge * 2u)

    // Floating Point Types
    // Float(F), Double
    val temperature:Float = 45.23F
    val price = 2.78
    println(price * 0.5)
    println(price as? Int)

    println(PI)

    // Boolean
    // true, false
    val isMale = true
    println(isMale)

    // Unsigned Integer Types
    val age = 27L
    var newAge = age.toUShort()
    newAge = 28.toUShort()
    println(newAge)

    // Numeric Conversion
    // toByte, toInt, toLong, toFloat, toDouble, toChar(), toString
    println(newAge.toString() + 2)
    println(newAge.toInt() + 2)
    println(newAge.toDouble().pow(5.0))

}