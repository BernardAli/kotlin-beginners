class GamePlayer(firstName: String, // constructor param
                 surname: String, // constructor param
                 var age: Int, // read-write property
                 val id: String, // readonly property // private property
                 private val message: String = "Happy Birthday")
    {
    // read-only property initialised in init block
    val fullname: String
    var favouriteGame: String // read-write property
    init {
    // firstName and surname only visible in init
        fullname = "$firstName $surname"
        favouriteGame = ""
    }

    override fun toString(): String {
        return "GamePlayer[$id, $fullname, $age]"
    }
    fun birthday() {
        val oldAge = age
        age++
        println("$message $fullname, you were $oldAge you are now $age")
    }
}


fun main() {
    val p1 = GamePlayer("Ben", "Ali", 30, "1")
    p1.birthday()
    println(p1)
    println(p1.fullname)
}