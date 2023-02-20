class User(val name: String) {
    var id: String = ""
    var game: String = ""
    override fun toString(): String {
        return "User(name='$name', id='$id', game='$game')"
    }
}

fun main() {
    var test = User("Ben Ali")
    test.id = "4"
    test.game = "Fifa 23"
    println(test)

    // apply {}
    var user = User("Ben").apply {
        this.id = "1"
        this.game = "NFS"
    }
    println(user)

    // rum {}
    user.run{
        print("Please input the users favourite game: ")
        val favouriteGame: String ? = readLine()
        game = favouriteGame ?: ""
    }
    println(user)

    // let {}
    val s2 = user.let { it.name.uppercase()}
    println(s2)

    val s3 = user.let {
        println(it)
        println(it.name)
        it.name.uppercase()
    }

    val r1 = user.id.let{
            id -> id.toByte()
    }
    println(r1)

    // also {}
    var user2 = User("Muna").also {
        println(it)
        it.id = "2"
        it.game = "Monopoly"
    }
    println(user2)

    val user3 = User("Isaac").also {u ->
        println(u)
        u.id = "3"
        u.game = "Monopoly"
    }
    println("user3: $user3")

    // with {}
    val label = with(user) {
        this.id = "new${this.id}"
        game = "new$game"// implicit reference to this
        println(this)
        this.toString()
    }
    println(label)

}