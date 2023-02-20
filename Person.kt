class Person(var name: String, _age: Int)
    {
        var age: Int = 0
            private set(value) {
                if (value < 0 || value > 120) {
                    throw InvalidAgeException(value,
                        "Age must be between 0 and 120")
                } else {
                    field = value
                }
            }
        init {
            age = _age
        }

        constructor(age: Int) : this("unnamed", age) {
            println("In auxiliary constructor")
        }

        override fun toString() = "Person($name, $age)"

        fun birthday() {
            var age = this.age
            age--
            println("Happy birthday you were $age")
            age++
            println("You are now $age")
            age ++
            println("You'll be $age next year")
        }

        fun add(a:Int, b:Int):Int = a + b

        override fun equals(other: Any?): Boolean {
            return when(other) {
                null -> false
                is Person -> ((other.name == name) && (other.age==age))
                else -> false
            }
        }
    }


fun main() {
    var p1 = Person("Eddie", 27)
    val p2 = Person("Ben", -1)
    val p3 = Person(30)
    println(p1.name)
    println(p2)

    val px = p1
    p1.name = "Ike"
    println(p1.name)
    println(px.name)
    println(p1.toString())

    println(p3.name)
    p3.birthday()

    println(p3.add(8, 22))

    println(p3.equals(p3))
}