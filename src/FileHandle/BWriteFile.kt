package FileHandle

import java.io.File
import java.nio.file.Files.lines

fun main()
{
    val file = File("output.txt")

    file.writeText("Hello Kotlin!")
    println("After writeText: ${file.readText()}")
    file.appendText("\nAfter writeText: ${file.readText()}")

    // 2. Append text
    file.appendText("\nAppended line")
    println("After appendText: ${file.readText()}")


    //Write Byte
    println("==================================")
    val byteArray = "Byte content".toByteArray()
    file.writeBytes(byteArray)
    println("After writeBytes: ${file.readText()}")
    println("==================================")


}