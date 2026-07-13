package Functions

    fun add(age: Int, name: String): String {
        return "$name is $age years old."
    }

//Normal logics
    fun sum(a: Int, b: Int): Int{
        return a + b
    }

//Funtions with parametors
fun animal(gender: String, name: String): String{
    return "$name is gender $gender";
}

fun main() {
    val result = add(20, "Mony")
    println(result)

    println(sum(30, 30))

    println(animal("Male","Cow"))
}