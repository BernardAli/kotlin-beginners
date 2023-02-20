class School constructor(private val id: String,
                      val name: String = "",
                      val age: Int = 0){
}

fun main() {
    val b = School("10")
    println(b)
}