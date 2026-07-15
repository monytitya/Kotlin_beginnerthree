package OOP

class MonyBanking() {
    // Private properties - cannot be accessed directly from outside
    private var _balance: Double = 0.0
    private var _transactionsHistory = mutableListOf<String>()

    // with getter & setter
        var balance: Double
        get() = _balance
        private set(value) {
            _balance = value
        }

    fun deposit(amount: Double) {
        require(amount > 0) { "Amount deposit must be positive" }
        _balance += amount
        _transactionsHistory.add("Deposited $$amount")
    }

    fun withdraw(amount: Double): Boolean {
        return if (amount > 0 && amount <= balance) {
            _balance -= amount
            _transactionsHistory.add("Withdrew: $$amount")
            true
        } else {
            println("Insufficient balance or invalid amount")
            false
        }
    }

    fun getTransactionHistory(): List<String> {
        return _transactionsHistory.toList()
    }

}

// class with encapsulations validations
class Product2(
    private val _name: String,
    private var _price: Double
) {
    val name: String
        get() = _name

    var price: Double
        get() = _price
        set(value) {
            require(value > 0) { "Price must be positive" }
            _price = value
        }

    init {
        require(_name.isNotBlank()) { "Product name cannot be blank" }
        require(_price > 0) { "Price must be positive" }
    }
}

fun main() {
    val account = MonyBanking()
    account.deposit(1000.0)
    account.withdraw(250.0)
    account.withdraw(1000.0)

    println("Current balance: ${account.balance}")
    println("Transaction history: ${account.getTransactionHistory()}")

    val product = Product2("Laptop", 999.99)
    println("Product: ${product.name} Price: ${product.price}")
    product.price = 899.99
    println("Updated price: ${product.price}")
}