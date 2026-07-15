package OOP


class Rectangles {
    var width: Int
    var height: Int


    //Secondnary Constuctors
    constructor(width: Int, height: Int) {
        this.width = width
        this.height = height
    }
}
// class 2
class Animals(val name: String){
    var age: Int = 0
    constructor(name: String ,age: Int ) : this(name)
    { this.age= age }

    fun display() = println("Animal: $name, Age: $age")
}




fun main()
{
    val rect1 = Rectangles(5, 3)
    val rect2 = Rectangles(4,3)
    val rect3 = Rectangles(10,3)

    println("Area 1: ${rect1}")
    println("Area 2: ${rect2}")
    println("Area 3: ${rect3}")

    val animal1 = Animal("Dog")
    val animal2 = Animals("Cat", 3)
    animal2.display()
}