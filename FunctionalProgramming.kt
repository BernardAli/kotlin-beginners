fun main() {
    var myList = listOf("Zero", "One", "Two")

    // Using a named function via a callable reference
    myList.forEach(::println)
    println("---------------------")

    // Using an anonymous function
    myList.forEach(fun(s: String) = println(s))
    println("---------------------")

    // Lambda function applied to each element in the list
    myList.forEach { s -> println(s) }
    myList.forEach { println(it) }

    val myArray = arrayOf("Adam", "Jasmine", "Phoebe", "Gryff")
    myArray.forEach { println(it) }

    myList = listOf("Zero", "One", "Two")
    myList.forEachIndexed { i, s -> println("index: $i value: $s") }

    println("Filter")
    fun isEven(i :Int) = i % 2 == 0
    var data = listOf(1, 3, 5, 2, 7, 4, 10)
    println("data; $data")
    // Filter using a named function
    val d1 = data.filter(::isEven)
    println("d1: $d1")
    // Filter using an anonymous function
    val d2 = data.filter(fun(i: Int) = i % 2 == 0)
    println("d2: $d2")
    // Filter for even numbers using a lambda function
    val d3 = data.filter{it % 2 == 0}
    println("d3: $d3")

    fun increment(i: Int) = i + 1
    println("data: $data")
    // Apply a named function via map
    val d4 = data.map(::increment)
    println("d4: $d4")
    // Apply an anonymous function via map
    val d5 = data.map(fun(i: Int) = i + 1)
    println("d5: $d5")
    // Apply a lambda function via map
    val d6 = data.map { it + 1 }
    println("d6: $d6")

    myList = listOf("Zero", "Fifteen", "One", "Two")
    println(myList)
    println(myList.sorted())
    println(myList.sortedBy { s -> s.length })

    data = listOf(1, 3, 5, 2, 7, 4, 10)
    println("data; $data")
    val result = data.fold(0){total, element -> total + element}
    println("result: $result")

    fun adder(total: Int, value: Int) = total + value
    val result2 = data.fold(0, ::adder)
    println("result2: $result2")
}