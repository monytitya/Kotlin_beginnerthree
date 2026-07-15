package OOP


class Persons{
    var name: String =""
    var age: Int = 0

    fun speak() {
        println("My name is $name, The age is $age")
    }
}

// Class 2
class Car(val brand: String, var model: String) {
    fun display() {
        println("Brand: $brand, Model: $model")
    }
}

fun main()
{
   val person1 = Persons()
    person1.name = "Tityamony"
    person1.age = 21
    //Call back Funtions
    person1.speak()

    println("========================================")
    val car1 = Car("Roroy", "Cambodia")
    val car2 = car1.display()

    car1.model = "Corolla"
    car1.display()


}