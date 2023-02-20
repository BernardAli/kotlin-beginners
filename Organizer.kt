interface Organizer {
    val owner: String
    fun add(appointment: String, date: String)
    fun get(date: String): String?
    fun remove(date: String): Boolean
}


interface Printer {
    fun prettyPrint()
}
interface Speaker {
    fun saySomething()
}

class Calendar(override val owner:String): Organizer{
    override fun add(appointment: String, date: String) {
        println("$appointment - $date")
    }
    override fun get(date: String): String? {
        return null
    }
    override fun remove(date: String): Boolean {
        return false
    }
}


object Diary : Organizer {
    override val owner: String = "John"

    override fun add(appointment: String, date: String) {
        println("add $appointment - $date")
    }

    override fun get(date: String): String? {
        return null
    }

    override fun remove(date: String): Boolean {
        return false
    }
}


class Application(override val owner: String) : Organizer,
    Printer,
    Speaker {
    // Speaker member function
    override fun saySomething() {}
    // Printer member function
    override fun prettyPrint() {}
    // Organizer member functions
    override fun add(appointment: String, date: String) {}
    override fun get(date: String): String? = null
    override fun remove(date: String): Boolean = false
}


fun main() {
    val cal = Calendar("John")
    cal.add("Dentist", "Monday")
    val org: Organizer = cal
    org.add("Garage", "Tuesday")
    Diary.add("Opticians", "Wednesday")
    val diary: Organizer = Diary
    diary.add("Doctors", "Thursday")
}