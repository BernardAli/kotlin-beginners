interface Writer {
    fun writeSomething()
}
interface Speakers {
    fun saySomething()
}
open class Author(val name: String)


class TechnicalAuthor(name: String) : Author(name),
    Writer,
    Speakers {
    override fun saySomething() {
        print("hello")
    }
    override fun writeSomething() {
        print("writers block")
    }
}