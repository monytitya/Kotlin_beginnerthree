package Exceptions

fun main() {
    // Part 1: Arithmetic Exception handling
    try {
        val result = 10 / 2
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Error: Cannot divide by zero!")
    }

    println("=======================================")

    // Part 2: Parsing helper function
    fun parseAge(input: String) {
        try {
            val age = input.toInt()
            println("Age: $age")
        } catch (e: NumberFormatException) {
            println("Invalid number format: ${e.message}")
        } catch (e: Exception) {
            println("An unexpected error occurred: ${e.message}")
        } finally {
            println("Parsing attempt finished.")
        }
        println("Parsing attempt finished.")
    }

    // Calling parseAge to show both cases:
    parseAge("25")
    println("---")
    parseAge("abc")
}