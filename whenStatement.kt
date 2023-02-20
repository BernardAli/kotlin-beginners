fun main() {
    val age:Any = 20
    val check = when (age) {
        in 12 .. 16 -> "Must be in School"
        in 17.. 18 -> "Can Drive"
        19, 20 -> "Can Vote"
        else -> "Can Do Everything"
    }
    println(check)

    val myDataType = when (age) {
        is Int -> println("Its a Int")
        is Double -> println("Its a Double")
        is Boolean -> println("Its a Boolean")
        is String -> println("Its a String")
        else -> println("its something else")
    }

    val dateYpe = myDataType
    println(myDataType)
}