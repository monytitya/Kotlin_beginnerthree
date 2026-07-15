package OOP

// Primary Constructor
class Person(
    val name: String,
    val age: Int,
    val gender: String
)

class Employee(
    val name: String
)

class User(
    val name: String,
    var age: Int,
    val email: String
)

class Products(
    val name: String,
    val price: Double
) : Any(){
    init {
        require(price > 0) {
            "Price must be positive"
        }

        println("Product '$name' created with price $$price")
    }
}

class Books(
    val title: String,
    val author: String = "Unknown",
    val year: Int = 2024
)

fun main() {

    // Person
    val person = Person("Tityamony", 21, "Male")
    println("Person")
    println("Name   : ${person.name}")
    println("Age    : ${person.age}")
    println("Gender : ${person.gender}")
    println()

    // Employee
    val employee = Employee("David")
    println("Employee")
    println("Name : ${employee.name}")
    println()

    // Users
    val user1 = User("tityamony", 21, "tityamony@email.com")
    val user2 = User("mannvy", 19, "mannvy@email.com")

    println("User 1")
    println("Name  : ${user1.name}")
    println("Age   : ${user1.age}")
    println("Email : ${user1.email}")
    println()

    println("User 2")
    println("Name  : ${user2.name}")
    println("Age   : ${user2.age}")
    println("Email : ${user2.email}")
    println()

    // Product
    val product = Products("Laptop", 999.99)

    println("Product")
    println("Name  : ${product.name}")
    println("Price : $${product.price}")
    println()

    // Books
    val book1 = Books("Kotlin Programming")
    val book2 = Books("Clean Code", "Robert C. Martin", 2008)

    println("Book 1")
    println("Title  : ${book1.title}")
    println("Author : ${book1.author}")
    println("Year   : ${book1.year}")
    println()

    println("Book 2")
    println("Title  : ${book2.title}")
    println("Author : ${book2.author}")
    println("Year   : ${book2.year}")
}