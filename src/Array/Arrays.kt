package Array

fun main()
{
    val array = arrayOf(1,0, 2, 3, 4, 5)
    val array1 = arrayOfNulls<Int>(5)
    val array4 = intArrayOf(10, 20, 30)

    val byteArray = byteArrayOf(1, 2, 3)
    val shortArray = shortArrayOf(1, 2, 3)
    val intArray = intArrayOf(1, 2, 3)
    val longArray = longArrayOf(1, 2, 3)
    val floatArray = floatArrayOf(1f, 2f, 3f)
    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    val booleanArray = booleanArrayOf(true, false, true)
    val charArray = charArrayOf('a', 'b', 'c')

    println(array[0])  // 1
    println(array.get(1))  // 2

    array[2] = 10
    array.set(1, 2)
    println(array.joinToString())

    println("Size: ${array.size}")
    println("Indices: ${array.indices}")
    println("Last index: ${array.lastIndex}")
    println(array1)
    println(arrayOf(1))

    println("===============|Interatee Orver array|==============")
    try {
        for (i in array.indices)
        {
            println("array1[$i] = ${array[i]}")
        }
    } catch (e: Exception) {
        TODO("Not yet implemented")
    }

    println("Contains 10? ${10 in array1}")
    println("Contains 100? ${100 in array1}")

}