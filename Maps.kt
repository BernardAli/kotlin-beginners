fun main() {
    val map1: MutableMap<Int, String> = mutableMapOf(
        1 to "John",
        2 to "Peter"
    )
    map1[1] = "Muna"
    map1[3] = "Ike"
    println(map1[1])
    println(map1[4])

    val map2 = mapOf(
        1 to "John",
        2 to "Peter"
    )

    val map = mutableMapOf(
        "Ireland" to "Dublin",
        "UK" to "London",
        "France" to "Paris",
        "Spain" to "Madrid",
    )

    println(map1)
    println(map2)
    println(map)

    // getOrDefault
    println(map1.getOrDefault(5, "Not Known"))

    // Properties
    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.isEmpty())

    //Adding entries
    map1[5] = "Derrick"
    map1.put(6, "Trudy")

    // Removing entries
    map1.remove(6)
    println(map1)

    for (i in map.keys){
        println(i)
    }

    for (i in map.values){
        println(i)
    }

    for (i in map){
        println(i)
    }

    for (i in map.keys){
        println(map[i])
    }

    // Nested Maps
    val seasons = mapOf(
        "Spring" to listOf<String>("Mar", "Apr", "May"),
        "Summer" to listOf<String>("Jun", "Jul", "Aug"),
        "Autumn" to listOf<String>("Sep", "Oct", "Nov"),
        "Spring" to listOf<String>("Dec", "Jan", "Feb"),
    )
    println(seasons)
    println(seasons["Spring"]?.get(1))
}