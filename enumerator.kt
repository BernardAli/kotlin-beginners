enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

enum class DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


fun main() {
    val d = Direction.NORTH
    println(d)
    println("d.name: ${d.name}")
    println("d.ordinal: ${d.ordinal}")

    if (d == Direction.NORTH) {
        println("We are heading North")
    }
    println(d < Direction.SOUTH)


    val day = DaysOfWeek.WEDNESDAY
    println(day)
    println(day < DaysOfWeek.FRIDAY)
    println(day < DaysOfWeek.MONDAY)
}