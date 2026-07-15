package OOP

class Calculator {
    // member function (method)
    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Int = if (b != 0) a / b else 0
}


class BankAccount(private var balance: Double) {
    // method with side effects
    fun deposit(amount: Double) {
        require(amount > 0) { "Deposit amount must be positive" }
        balance += amount
        println("Deposited $$amount. New balance: $$balance")
    }
    fun withdraw(amount: Double): Boolean {
        return if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance: $$balance")
            true
        } else {
            println("Insufficient balance!")
            false
        }
    }

    fun getBalance(): Double = balance
}


fun main()
{
    println("================================================")
    val calc = Calculator()
    println("10 + 5 = ${calc.add(10, 5)}")
    println("10 - 5 = ${calc.subtract(10, 5)}")
    println("10 * 5 = ${calc.multiply(10, 5)}")
    println("10 / 5 = ${calc.divide(10, 5)}")
    println("================================================")
    println("================================================")
    val account = BankAccount(1000.0)
    account.deposit(500.0)
    account.withdraw(200.0)
    account.withdraw(1500.0)
    println("Current balance: ${account.getBalance()}")
    println("================================================")
}