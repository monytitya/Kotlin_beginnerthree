package FileHandle

import java.io.File


fun main()
{

    //Create
    val sampleFile = File("samplefile.txt");
    sampleFile.writeText("Test handleFiles\nFile Handling")

    //Read
    val content = sampleFile.readText()
    println("Read files\n$content")

    // 4. Use buffered reader for large files
    val bufferedReader = sampleFile.bufferedReader()
    val firstLine = bufferedReader.readLine()
    println("First line using bufferedReader: $firstLine")
    bufferedReader.close()

    //Read byte
    println("===========================================")
    val bytes = sampleFile.readBytes()
    println("Read bytes ${bytes.size}")
    println("===========================================")

    //Read with charset
    println("===========================================")
    val utf8Content = sampleFile.readText(Charsets.UTF_8)
    println("UTF-8 content length: ${utf8Content.length}")
    println("===========================================")


}
