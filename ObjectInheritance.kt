open class Logger {
    fun log() = println("Log")
}

object HelloWorldLogger: Logger(){
    fun doSomething() = log()
}


fun main() {
    HelloWorldLogger.doSomething()

}