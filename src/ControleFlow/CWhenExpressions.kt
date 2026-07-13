package ControleFlow

fun main()
{
    val day = 3
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(dayName)


    val number = 15
    when {
        number < 0 -> println("Negative")
        number == 0 -> println("Zero")
        number > 0 -> println("Positive")
    }


    val score = 85
    when (score) {
        in 90..100 -> println("Grade A")
        in 80..89 -> println("Grade B")
        in 70..79 -> println("Grade C")
        in 60..69 -> println("Grade D")
        else -> println("Grade F")
    }


    val obj: Any = "Hello"
    when (obj) {
        is String -> println("It's a String of length ${obj.length}")
        is Int -> println("It's an Integer")
        else -> println("Unknown type")
    }
}