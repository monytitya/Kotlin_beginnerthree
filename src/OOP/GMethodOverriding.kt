package OOP

open class  Shape{
    open fun area(): Double = 0.0
    open fun  perimeter(): Double = 0.0
    open fun draw() {
        println("Drawing a shape")
    }
}

class Circle(val radius: Double) : Shape()
{
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
    override fun draw() {
        println("Drawing a circle with radius $radius")
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
    override fun draw() {
        println("Drawing a rectangle $width x $height")
    }
}

fun main()
{
    val circle = Circle(5.0)
    println("Circle area: ${circle.area()}")
    println("Circle perimeter: ${circle.perimeter()}")
    circle.draw()

    val rect = Rectangle(4.0, 3.0)
    println("Rectangle area: ${rect.area()}")
    println("Rectangle perimeter: ${rect.perimeter()}")
    rect.draw()
}