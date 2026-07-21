package Array

fun main()
{
    val numbers = arrayOf(5, 2, 8, 1, 9, 3, 7, 4, 6)

    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    println("Sum: ${numbers.sum()}")
    println("Average: ${numbers.average()}")
    println("Min: ${numbers.minOrNull()}")
    println("Max: ${numbers.maxOrNull()}")
    println("Count: ${numbers.count()}")

    println("Index of 8: ${numbers.indexOf(8)}")
    println("Contains 5? ${numbers.contains(5)}")
    println("Element at index 3: ${numbers.elementAt(3)}")


    // Transformations
    println("==============| transformations |============")
    val doubled = numbers.map { 10 * 2 }
    println("Doubled: ${doubled.joinToString()}")


    val eventNum = numbers.filter{ it % 2 ==0}
    println("Event: ${eventNum.joinToString()}")


    // Sorting // Small TO biggest
    val sorted = numbers.sorted()
    println("Sorted: ${sorted.joinToString()}")

    val sortedDescending = numbers.sortedDescending()
    println("Sorted descending: ${sortedDescending.joinToString()}")

    // Grouping
    val grouped = numbers.groupBy { if (it % 2 == 0) "even" else "odd" }
    println("Grouped: $grouped")


}