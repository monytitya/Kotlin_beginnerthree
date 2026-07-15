package OOP


class Employees ()
{
    private var id: Long = 0
    private var _name: String = ""

    var salary: Double = 0.0
        private set

    //Getter and Setter

    fun setEmployee(id: Long, name: String, salary: Double) {
        this.id = id
        this._name = name
        this.salary = salary
    }

    fun raiseSalary(percentage: Double)
    {
        if(percentage <= 0)
        {
            println("Error: Percentage must be greater than 0.")
            return
        }
        salary += salary * percentage
    }
    fun displayInfo(){
        println("ID: $id")
        println("Name: $_name")
        println("Salary: $salary")
    }
}

fun main()
{
    val employee = Employees()
    employee.setEmployee(
        id = 1,
        name = "Mony",
        salary = 1000.0
    )
    employee.displayInfo()
    println()

    employee.raiseSalary(0.10)
    employee.displayInfo()


}