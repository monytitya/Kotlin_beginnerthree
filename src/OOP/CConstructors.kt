package OOP


//Primary Constructors
class Persson(name: String, age: Int, gender: String)

class Employee public constructor(name: String)

class User(val name: String, var age: Int, val email: String)

class Product(val name: String, val price: Double) {
    init {
        require(price > 0) {"Price must be positive"}
        println("Product $name created with price $$price")
    }

}

class Book(val title: String, val author: String = "Unknown", val year: Int = 2024)




fun main()
{
    val user1 = User("tityamony",21,"tityamony@email.com")
    println("The name is ${user1.name}, the age is ${user1.age} year old, the email is ${user1.email}")

    val user2 = User("mannvy", 19, "mannvy@email.com")
    println("The name is ${user2.name}, the age is ${user2.age}, the email is ${user2.email}")


    val product = Product("Laptop", 999.99)
    val book1 = Book("Kotlin Programming")
    val book2 = Book("Clean Code", "Robert Martin", 2008)

    println("Book: ${book1.title} by ${book1.author}")
    println("Book: ${book2.title} by ${book2.author} (${book2.year})")
}