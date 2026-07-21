package Collections

fun main()
{
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Basic filter
    val evens = numbers.filter { it % 2 == 0 }
    val odds = numbers.filter { it % 2 != 0 }
    val greaterThan5 = numbers.filter { it > 5 }

    println("Evens: $evens")
    println("Odds: $odds")
    println("Greater than 5: $greaterThan5")
}

