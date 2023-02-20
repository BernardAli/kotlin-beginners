import kotlin.math.pow

fun main() {
    var a = 5
    var b = 20
    // Comparison Operators
    // ==, !==, >, >=, <, <=

    // Logical Operators
    // &, &&, |, ||, ^, !

    // Numerical Operators
    // +, -, *, /, %

    // Unary Operators
    // ++, --
    val newA = a++
    println("newA = $newA")

    val newB = ++b
    println("newB = $newB")

    // Assignment Operators
    // +=, -=, *=, /=, %=
    println()

    // If statements
    val min = if (a < b) a else b
    val max = if (a > b) a else b
    println(max)
    println(min)

    println("Starting")
    print("Enter a number: ")

    val inputString = readlnOrNull()
    val number = inputString!!.toInt()

    if (number > 0) {
        // Multiple lines grouped together for the if statement
        println("$number is positive")
        println("$number squared is ${number * number}")
        println("$number cubed is ${number.toDouble().pow(3)}")
    } else if (number == 0) {
        println("Its Zero")
    } else {
        println("$number Its negative")
    }
    println("Bye")


    val age = readln().toInt()
    var status = ""
    status = if (age > 12 && age < 20) "teenager" else "not a teenager"
    println("$age - you are $status")

    var temp = 0
    var feeling = "cold"
    while (temp <= 26){
        temp ++
        if (temp >= 20){
            feeling = "warm"
            break
        }
    }
    println(temp)
    println(feeling)


}