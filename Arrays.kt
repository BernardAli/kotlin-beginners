fun main() {
    val asc = Array(5) {i -> (i * i).toString()}
    println(asc)
    println(asc[3])

    val intArray1 = IntArray(5)
    intArray1[0] = 2

    println(intArray1[0])

    for (i in intArray1.indices) {
        println(i)
    }

    val data = arrayOf(5, 1, 2, 3, "", 5.36)
    println(data[3])

    val intArray2 = intArrayOf(2, 4, 6, 8)

    val names = arrayOf("John", "Denise", "Adam", "Phoebe")
    println(names)
    println("size(): ${names.size}")
    println("first(): ${names.first()}")
    println("last(): ${names.last()}")
    println("copyOf(): ${names.copyOf()}")
    println("sliceArray(2..3): ${names.sliceArray(2..3)}")
    names.reverse()
    println("reversed array: $names")
    for (name in names) { print("$name, ") }
    println("\nasList(): ${names.asList()}")
}