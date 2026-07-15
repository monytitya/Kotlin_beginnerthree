package OOP

open class Product(val title: String, val basePrice: Double)
{
    open fun Getdetails() : String{
        return "$title costs $basePrice"
    }
}

class Book(title: String, basePrice: Double, val author: String) : Product(title, basePrice)
{

}




fun main()
{
}