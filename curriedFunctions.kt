fun main() {
    println(operation(20, 5))
    val doubler = multyBy(2) {i, j -> i * j}
    val tripler = multyBy(3) {i, j -> i * j}
    println("double(5): ${doubler(5)}")
    println("tripler(5): ${tripler(5)}")
}

fun operation(x:Int, y:Int) = x * y

fun multyBy(num: Int, func: (Int, Int) -> Int): (Int) -> Int {
    return fun(y: Int) = func(num, y)
}