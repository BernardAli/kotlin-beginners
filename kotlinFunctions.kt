import kotlin.math.pow

fun main() {
    printMessage()
    printMessage2("Ben Ali")
    printMessage2("Eddie Ali")
    printMessage2("Muna Ali")
    printMessage2("Isaac Agyemang")

    add(20, 22)
    add(41, 19)
    add(a = 21, 199)
    add(21)
    add(b = 50, a = 120)
    add(a = 100)
    println(max(199, 201))
    println(newMax(199, 201))

    greeting("ben", "ike", "eddie", "muna")
    greeting("ike", "eddie", "muna")

    squared(0, 2, 4, 56, 7)

    println(func(2, 3))
    println(addOne(25))

    println(increase(80))

    println(factorial(8))

    println(factorialTailRec(n=8))

    println(calculate())
}

fun printMessage(){
    println("Hello World!")
}

fun printMessage2(msg:String){
    println("Hello, $msg")
}

fun add(a:Int, b:Int=0){
    println(a + b)
}

fun max(a:Int, b:Int):Int {
    return if( a > b) a else b
}

fun newMax(a:Int, b:Int):Int = if (a >b) a else b


// Arbitrary Number of Arguments
fun greeting(vararg persons:String) {
    persons.forEach { print("$it \n") }
}

fun squared(vararg nums:Int){
    nums.forEach { println("${it.toDouble().pow(2)}") }
}

// Parameters are vals
fun add(i: Int): Int {
    return i * 2
}


// Anonymous Functions
var func = fun (a:Int, b:Int):Int {return a * b}


// Single Expression
fun addOne (a:Int):Int = a * a


// Lambda
val increase = {a:Int -> a * a}

val multiplyUs = {a:Int, b:Int -> a * b}


// Recursive Functions
fun factorial(n:Int):Long{
    return if (n <= 1){
        1
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun factorialTailRec(acc: Int = 1, n: Int): Int {
// Termination condition
    return if (n == 1)
        acc // Base case
    else
        factorialTailRec(acc * n, n - 1) // Tail Recursive call
}

inline fun calculate(): Int = 2 + 3

