open class Human(var name: String, var age:Int){
    init {
        println("Base Class Init")
    }
    fun birthday(){
        println("Happy birthday $name")
        println("You are $age years old")
    }

    override fun toString() = "Person($name, $age)"
}


open class Employee(name:String, age:Int, var id:String): Human(name, age){
    var rateOfPay: Double = 7.5

    fun calculatePay(hoursWorked: Int): Double {
        return hoursWorked * rateOfPay
    }

    override fun toString() = "Employee($id, $name, $age)"
}


class SalesPerson(name:String, age:Int,  id:String, var region:String, var sales: Double):Employee(name, age, id){
    fun bonus(): Double {
        return sales * 0.5
    }
}

fun main() {
    val eddie = Human("Edward", 27)
    println(eddie.toString())
    println(eddie.birthday())
    println("${ eddie.name } ${eddie.age}")

    val yaw = Employee("yaw", 41, "1")
    println(yaw.toString())
    println(yaw.age)
    yaw.birthday()
    println(yaw.calculatePay(180))

    val ben = SalesPerson("Phoebe", 32, "XYZ987", "South West", 905.55)
    println(ben.bonus())
}