class InvalidAgeException(val invalidAge: Int, message: String): Exception(message)

class Human1(val name: String, _age: Int) {
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
}

fun main() {
    try {
        val p1 = Human1("Adam", -1)
        println(p1)
    } catch (exp: InvalidAgeException) {
        println(exp.invalidAge)
        println(exp.message)
        println(exp)
    }

    println("----------")
    val result0 = runCatching {
        "32".toInt()
    }.getOrDefault(-1)
    println("result0 $result0")

    val result1 = runCatching {
        "32a".toInt()
    }.getOrElse {
        println(it)
        0
    }
    println("result1 $result1")

    val result2 = runCatching {
        "32a".toInt()
    }.getOrNull()
    println("result2 $result2")

//    val result3 = runCatching {
//        "32a".toInt()
//    }.getOrThrow()
//    println("result3: $result3")

    println("-----------")
    runCatching { "32".toInt() }
        .map { println(it) }
    runCatching { "32a".toInt() }
        .map { println(it) }

    println("-----------")

    runCatching { "32a".toInt() }
        .recover {
            it.printStackTrace()
            -1
        }
        .map { println(it) }

    println("-----------")

    runCatching {
        "32a".toInt()
    }.onFailure {
        when (it) {
            is NumberFormatException -> {
                print("Oops - number wasn't formatted correctly: ")
                println(it.message)
            }
            is Exception -> {
                println("some other exception")
                it.printStackTrace()
            }
            else -> throw it
        }
    }.onSuccess {
        println("All went well")
        println(it)
    }
}