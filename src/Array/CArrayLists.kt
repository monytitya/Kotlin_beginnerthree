package Array


val fruits = listOf("Apple", "Banana", "Cherry", "Date")

val numbers = listOf(1, 2, 3, 4, 5)

val empty = emptyList<String>()



fun main()
{
    println("Fruits: $fruits")
    println("First fruit: ${fruits.first()}")
    println("Last fruit: ${fruits.last()}")
    println("Fruit at index 2: ${fruits[2]}")
    println("Index of Banana: ${fruits.indexOf("Banana")}")



    // Check if element exists
    println("Contains Apple? ${"Apple" in fruits}")
    println("Contains Grape? ${"Grape" in fruits}")




}