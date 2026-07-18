package OOP

open class Productss(val title: String, val basePrice: Double)
{
    open fun Getdetails() : String{
        return "$title costs $basePrice"
    }
}

class Book(title: String, basePrice: Double, val author: String) : Productss(title, basePrice)
{

}




fun main()
{
}