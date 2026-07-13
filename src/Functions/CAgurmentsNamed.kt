package Functions

fun createUser(
    name: String,
    age: Int,
    email: String,
    city: String = "Unknown"
){ println("Name: $name, Age: $age, Email: $email, City: $city") }


fun displayInfo(
    firstName: String,
    lastName: String,
    age: Int,
    country: String
){ println("$firstName $lastName, $age years old, from $country") }


fun main() {
    createUser(
        email = "sok@example.com",
        name = "Sok",
        age = 25
    )
    displayInfo(
        "Sok",
        lastName = "Sokha",
        age = 25,
        country = "Cambodia"
    )
    displayInfo(
        firstName = "Dara",
        lastName = "Rith",
        age = 30,
        country = "Cambodia"
    )
}
