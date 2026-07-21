package Exceptions

class UserService
{
    fun findUser(id: Int): String {
        if(id <= 0)
        {
            throw IllegalArgumentException("ID must be positive")
        }
        return "User $id";
    }

    fun processAge(age: Int)
    {
        require(age >= 0) { "Age cannot be negative" }
        require(age <= 150) { "Age cannot exceed 150" }
        println("Age is valid: $age")
    }

    fun processName(name: String?) {
        val validName = requireNotNull(name) { "Name cannot be null" }
        require(validName.isNotBlank()) { "Name cannot be blank" }

        println("Name: $validName")
    }

    fun parseIntSafe(str: String): Int? {
        return str.toIntOrNull()
    }


}


fun main()
{
    val service = UserService()

    try {
        service.processAge(-5)
    } catch (e: IllegalArgumentException) {
        println("Require failed: ${e.message}")
    }

    try {
        service.processName(null)
    } catch (e: IllegalArgumentException) {
        println("RequireNotNull failed: ${e.message}")
    }

    try {
        service.processName(null)
    } catch (e: IllegalArgumentException) {
        println("RequireNotNull failed: ${e.message}")
    }


}
