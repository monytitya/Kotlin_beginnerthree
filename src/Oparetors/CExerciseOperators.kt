package Oparetors

data class Product(var name: String, var price: Double)

fun main()
{

    val cartTotal = 49.99
    val accountBalance = 50.00
    val freeShippingThreshold = 50.00

    val itemA = Product("Wireless Mouse", 25.00)
    val itemB = Product("Wireless Mouse", 25.00)
    val itemC = itemA

    val canAfford = accountBalance >= cartTotal
    println("Can afford cart: $canAfford")

    val needsToPayShipping = cartTotal < freeShippingThreshold
    println("Needs to pay shipping: $needsToPayShipping")

    val isSameContent = itemA == itemB
    println("itemA and itemB have same data: $isSameContent")


    val isSameIdentityAB = itemA === itemB
    val isSameIdentityAC = itemA === itemC

    println("itemA and itemB are same memory instance: $isSameIdentityAB")
    println("itemA and itemC are same memory instance: $isSameIdentityAC")

}