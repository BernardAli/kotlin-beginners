interface Printers {
    fun prettyPrint()
    fun printLabel() {
        println(label)
        printMe()
    }
    companion object {
        private const val label = "Label"
        fun printMe() {
            println("Printer - printMe")
        }
    }
}

class ShoppingBasket : Printers {
    override fun prettyPrint() {
        println("ShoppingBasket - prettyPrint")
    }
}


fun main() {
// Can call member function on interface
    Printers.printMe()
// Compile error
// ShoppingBasket.printMe()
    val basket = ShoppingBasket()
// Compile error
// basket.printMe()
    basket.prettyPrint()
// Compile error
// Printer.prettyPrint()
}