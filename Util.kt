class Util {
    class Printer {
        fun print(msg: String) {
            println(this.javaClass.name + " - " + msg)
        }
    }

    interface Printable {
        fun convert(): String?
    }

    object Session {
        val id = 2
        fun doSomething() {
            println("Do Something")
        }
    }

    abstract class DefaultPrintable : Printable {
        abstract val name: String?
    }
}