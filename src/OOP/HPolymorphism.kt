package OOP

open class PaymentMethod {
    open fun pay(amount: Double): String {
        return "Paying $$amount"
    }
}

class CreditCard(val cardNumber: String) : PaymentMethod() {
    override fun pay(amount: Double): String {
        return "Paid $$amount using Credit Card ending in ${cardNumber.takeLast(4)}"
    }
}

class PayPal(val email: String) : PaymentMethod() {
    override fun pay(amount: Double): String {
        return "Paid $$amount using PayPal account $email"
    }
}

class Cash : PaymentMethod() {
    override fun pay(amount: Double): String {
        return "Paid $$amount in cash"
    }
}

fun processPayment(method: PaymentMethod, amount: Double) {
    println(method.pay(amount))
}

fun main() {
    //Polymorphism in actions
    val payments: List<PaymentMethod> = listOf(
        CreditCard("1234-5678-9012-3456"),
        PayPal("MaoTityamony@gmail.com"),
        Cash()
    )

    for (payment in payments) {
        processPayment(payment, 100.0)
    }
    // Functions for Polymorphism
    val method = getPaymentMethod("credit")
    print(method)
}

fun getPaymentMethod(type: String): PaymentMethod {
    return when (type) {
        "credit" -> CreditCard("0000-1111-2222-3333")
        "paypal" -> PayPal("shop@example.com")
        else -> Cash()
    }

}