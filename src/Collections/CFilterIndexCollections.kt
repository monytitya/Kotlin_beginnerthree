package Collections

val numbers2 = listOf(1, 2, 3, 4, 5)
val mixed = numbers.filter {it % 2 == 0}

val filtered = numbers.filterIndexed { index, value ->
    index > 1 && value > 25
}

//Filter Notnull
val mixedList: List<String?> = listOf("Kotlin", null, "Java", "Androids", "Springboot")
val  cleanList = mixedList.filterNotNull()


fun main()
{
    println(numbers2[1])
    println(filtered)
    println(mixed)
    println("=========================|Clean List|=========================")
    println(cleanList)



}