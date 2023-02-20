import kotlin.random.Random

fun main() {
    println("Hello World!")
    println(12 * 18.5)
    println("Enter your name: \n")
    val name = readlnOrNull()
    println("Your name is $name")

    val age = readln().toInt()
    println("You'll be ${age + 1} next year")

    println(Random.nextInt(1, 21))
}