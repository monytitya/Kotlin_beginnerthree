package OOP


class Rectangle {
    var width: Int
    var height: Int


    //Secondnary Constuctors
    constructor(width: Int, height: Int) {
        this.width = width
        this.height = height
    }
}
// class 2
class Animal(val name: String){
    var age: Int = 0
    constructor(name: String ,age: Int ) : this(name)
    { this.age= age }

    fun display() = println("Animal: $name, Age: $age")
}




fun main()
{
    val rect1 = Rectangle(5, 3)
    val rect2 = Rectangle(4,3)
    val rect3 = Rectangle(10,3)

    println("Area 1: ${rect1.area()}")
    println("Area 2: ${rect2.area()}")
    println("Area 3: ${rect3.area()}")

    val animal1 = Animal("Dog")
    val animal2 = Animal("Cat", 3)
    animal1.display()
    animal2.display()
}