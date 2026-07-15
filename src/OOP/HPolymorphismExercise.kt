package OOP

open class Delivery(val weight: Double, val descriptions: String)
{
    open fun calculateFee() : Double
    {
        return 0.0
    }
}

// SubClass
class StandartDelivery(weight: Double, description: String) : Delivery(weight, description){
    override fun calculateFee(): Double
    {
        return 0.0
    }
}
class ExpressDelivery(weight: Double, description: String) : Delivery(weight, description)
{
     override fun calculateFee(): Double
     {
         return 0.0
     }
}

class FreeDelivery(weight: Double, descriptions:String) : Delivery(weight, descriptions)
{
    override fun calculateFee(): Double
    {
        return 0.0
    }
}

fun main()
{
    val deliveries : List<Delivery> = listOf(
        StandartDelivery(100.0,"test")

    )

}