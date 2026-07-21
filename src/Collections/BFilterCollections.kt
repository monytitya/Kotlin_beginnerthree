package Collections


val numbers = listOf(1, 2, 3, 4, 5)


//basic filter
val evens = numbers.filter { it % 2 == 0 }
val odds = numbers.filter { it % 2 != 0 }
val greaterThan5 = numbers.filter { it > 5 }





fun main()
{

    println("Evens: $evens")
    println("Odds: $odds")
    println("Greater than 5: $greaterThan5")

}