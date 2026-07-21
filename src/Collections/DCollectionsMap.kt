package Collections

val numbers3 = listOf(1, 2, 3, 4)
val doubled = numbers3.map { it * 2 }

val names = listOf("Kotlin","java","Springboot")

fun main()
{
    println(doubled)
    println(names)

}