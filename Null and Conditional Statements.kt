fun main() {
    var name = "Bernard Ali"
    println("My name is $name")

    // Explicit checking
    var string:String? = null
    string = "Kwadaso"

    if (string == null) {
        println(null)
    } else {
        println(string.length)
        println("$string")
    }

    // Safe Call
    println(string?.length)

    // Elvis operator with ?:
    println(string?.length ?: -1)

    // Not-Null Assertion Operator
    string = "Bernard"
    println(string!!.length)

    // Safe Casting to Null Type with as?
    var total: Int? = null
    println(total as? Int ?: -1)
}