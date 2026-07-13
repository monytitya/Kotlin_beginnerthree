package ControleFlow

fun main()
{
    // Variables
    val accountTier = "Standard"
    val withdrawalAmount = 40

    //Logics is goes
    val transactionFee: Double = when (accountTier) {
        "VIP" -> 0.0
        "Premium" -> when (withdrawalAmount) {
            100, 200 -> 1.0
            else -> 2.5
        }
        "Standard" -> when (withdrawalAmount) {
            in 1..50 -> 3.0
            in 51..500 -> 5.0
            else -> {
                println("Error: Limit exceeded for Standard tier.")
                -1.0
            }
        }
        else -> -1.0
    }
    println("Account Tier: $accountTier")
    println("Withdrawal: $$withdrawalAmount")
    println("Calculated Fee: $$transactionFee")
}