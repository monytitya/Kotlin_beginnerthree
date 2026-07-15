package OOP

open class Delivery(val weight: Double, val descriptions: String)
{
    open fun calculateFee(): Double {
        return weight * 2.0
    }
}

// SubClass
class StandartDelivery(weight: Double, description: String) : Delivery(weight, description) {
    override fun calculateFee(): Double {
        return 5.0 + (weight * 1.5)
    }
}

class ExpressDelivery(weight: Double, description: String) : Delivery(weight, description) {
    override fun calculateFee(): Double {
        return 10.0 + (weight * 3.0)
    }
}

// Subclass 3: Free Delivery (Always $0.00, regardless of weight)
class FreeDelivery(weight: Double, descriptions: String) : Delivery(weight, descriptions) {
    override fun calculateFee(): Double {
        return 0.0
    }
}

fun main() {
    val deliveries: List<Delivery> = listOf(
        StandartDelivery(10.0, "Standard package to NY"),
        ExpressDelivery(5.0, "Urgent documents to LA"),
        FreeDelivery(50.0, "Promotional oversized item")
    )
    println("--- Delivery Fee Summary ---")
    for (delivery in deliveries)
    {
        val fee = delivery.calculateFee()
        println("Type: ${delivery.javaClass.simpleName}")
        println("Description: ${delivery.descriptions}")
        println("Weight: ${delivery.weight} kg")
        println("Calculated Fee: \$${String.format("%.2f", fee)}")
        println("----------------------------")
    }

}
