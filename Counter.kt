data class Counter(var value: Int) {
    operator fun plusAssign(c: Counter) {
        value += c.value
    }
    operator fun minusAssign(c: Counter) {
        value += c.value
    }
    operator fun plus(other: Counter) {
        value += other.value
    }
    operator fun minus(other: Counter) {
        value -= other.value
    }
    operator fun plus(other: Int) {
        value += other
    }
    operator fun minus(other: Int) {
        value -= other
    }

    operator fun inc():Counter = Counter(value + 1)
    operator fun dec():Counter = Counter(value - 1)
}



fun main() {
    val c1 = Counter(1)
    val c2 = Counter(5)
    c2 += c1
    println("c2 += c1: $c2")

    var c = Counter(1)
    c++
    println(c)
}