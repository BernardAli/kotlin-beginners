import kotlin.math.pow

fun main() {
    var number = 0

    println("Starting")
    while (number <= 10){
        print("$number ")
        if (number == 8){
            break
        }
        number++
    }
    println("\nDone")

    number = 0
    do {
        print("$number ")
        number++
    } while (number <= 10)
    println("\nDone")

    while (true){
        println("q: quit")
        val toContinue = readLine()
        if (toContinue == "q"){
            break
        }
        else {
            println(toContinue)
        }
    }

    var values = 20 downTo 0
    for (i in values){
        println(i)
        println(i.toDouble().pow(5))
    }
    println()

    repeat(3){
        println("I love Muna")
    }

    loop@ for (i in 0 until 4) {
        for (j in 0 until 3) {
            if (i == 3) {
                break@loop
            }
            println("$i - $j, ")
        }
    }

    for (i in 0 until 10) {
        print("$i ")
        if ((i % 2) == 1) {
            continue
        }
        println("hey its an even number")
        println("we love even numbers")
    }
    println("Done")

    for (i in 0..10) {
        when (i) {
            2 -> continue
            7 -> break
            else -> println(i)
        }
    }
}