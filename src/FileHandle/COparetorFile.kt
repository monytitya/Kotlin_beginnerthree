package FileHandle

import java.io.File

fun  main()
{
    val sourceFile = File("source.txt")
    sourceFile.writeText("This is the source content")

    // 2. Copy file
    val destFile = File("destination.txt")
    sourceFile.copyTo(destFile, overwrite = true)
    println("Copied to: ${destFile.absolutePath}")

    // 3. Rename/Move file
    val renamedFile = File("renamed.txt")
    sourceFile.renameTo(renamedFile)
    println("Renamed to: ${renamedFile.name}")

    val deleted = renamedFile.delete()
    println("Renamed file deleted: $deleted")


    println("File name: ${sourceFile.name}")
    println("Absolute path: ${sourceFile.absolutePath}")
    println("Files byte : ${sourceFile.length()} bytes")
}