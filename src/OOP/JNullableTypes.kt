package OOP

var name : String = "Mony"

var nullableName: String? = "Sok"
var age: Int? = 25
var address: String? = null

fun main()
{
    nullableName = null
    age = null


    println("Name: $name")
    println("Nullable Name: $nullableName")
    println("Age: $age")
    println("Address: $address")

    if (name != null) {
        println(name.length)
    } else {
        println("Name is null")
    }
}