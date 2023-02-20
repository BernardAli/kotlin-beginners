fun main() {
    val set: Set<Boolean> = HashSet()
    val set1: Set<String> = HashSet()
    val set2: MutableSet<String> = HashSet()
    // More idiomatic Kotlin
    val set3 = setOf<String>("One", "Two", "Three")
    val set4 = mutableSetOf("A", "B", "C", "A", "D")
    val set5 = mutableSetOf("Chasing Pavements",
        "Rumour Has it",
        "Turning Tables")
    println(set)
    println(set1)
    println(set2)
    println(set3)
    println(set4)
    println(set5)

    println("Properties")
    println(set4.size)
    println(set4.isEmpty())
    println(set4.isNullOrEmpty())

    // Accessing sets elements
    for (value in set4){
        println(value)
    }

    // Working with sets
    println(set4.contains("E"))
    println(set4.contains("D"))

    val test = if (set4.contains("E")) "True" else "False"
    println(test)

    // Adding to sets
    set4.add("F")
    println(set4)

    set4.remove("C")
    println(set4)

    set4.addAll(set1)
    println(set4)

    // sets like operations
    var coreMaths = mutableSetOf<String>("Ali", "Isaac", "Sheriff", "Eunice", "Mavis", "Ivy", "Derrick", "Aletse")
    var b2 = mutableSetOf<String>("Ali", "Isaac", "Sheriff", "Eunice", "Mavis", "Aletse")

    println(coreMaths.union(b2))
    println(coreMaths.intersect(b2))
    println(coreMaths.subtract(b2))
}