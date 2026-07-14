package OOP

class Student {

    var name: String = ""
    var score: Int = 0
    var grade: String = ""
        get() = when {
            score >= 90 -> "A"
            score >= 80 -> "B"
            score >= 70 -> "C"
            score >= 60 -> "D"
            else -> "F"
        }
    var id: String = ""

        set(value) {
            field = value.uppercase()
        }
    lateinit var school: String
    val fullInfo: String by lazy {
        "Student: $name, ID: $id"
    }
    fun assignId(newId: String) {
        id = newId
    }
}

fun main()
{
    val student = Student()
    student.name = "Sok"
    student.score = 85
    student.assignId("S001")

    println("Name: ${student.name}")
    println("Score: ${student.score}")
    println("Grade: ${student.grade}")
    println("ID: ${student.id}")

    student.school = "RUPP"
    println("School: ${student.school}")
    println(student.fullInfo)
}


