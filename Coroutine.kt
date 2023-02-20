import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Main -> Launching fire-and-forget task")

    suspend fun executeSlowTask() {
        println("Starting Task")
        delay(5000)
        println("Done Task")
    }

    GlobalScope.launch {
        executeSlowTask()
    }

    println("---------------------------------")
    println("Main -> After launching coroutine")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("---------------------------------")
    println("Main -> Done")
}