package ControleFlow

fun main()
{

    val ages = 20
    if (ages >= 18) {
        println("You are an adult!")
    }

    val age = 20
    if (age >= 18) {
        println("You are an adult!")
    } else {
        println("You are a minor!")
    }

    val result = if (age >= 18) "Adult" else "Minor"
    println(result)

}