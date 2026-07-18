package OOP


data class User(
    val age: Int,
    val name: String,
    val email: String,
    val Isactive: Boolean= true
)

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val category: String
)

data class Point(val x: Int, val y: Int)


fun main()
{
    val user1 = User(20, "Tityamony", "Tityamony@gmail.com")
    val user2 = User(21, "Dara", "dara@email.com", false)

    println(user1)
    println(user2)


}