package ControleFlow

fun main()
{
    // 1 To 10 Loop with range
    for(i in 1..10)
    {
        println("i : $i")
    }

    println("=================")
    // for loop  (downTo)
    for (i in 6 downTo 1) {
        println("i = $i")
    }

    println("=================")
    for (i in 10 downTo 0)
    {
        println("i : $i")
    }
    println("=================")

}