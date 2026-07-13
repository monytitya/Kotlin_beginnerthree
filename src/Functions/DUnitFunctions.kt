package Functions


//Functions not given price
fun printMessage(message: String): Unit {
    println(message)
}

fun logInfo(info: String): Unit {
    println("[INFO] $info")
}

fun showDialog(title: String): Unit {
    println("Showing dialog: $title")
    return Unit
}

fun main() {
    printMessage("Hello, World!")
    logInfo("Application started")
    showDialog("Welcome")
}
