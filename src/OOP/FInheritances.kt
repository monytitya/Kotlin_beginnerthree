package OOP

open class Animal(val name: String)
{
    open fun makeSound(){
        println("$name makeingsound!!!")
    }
    fun eat(){
        println("$name eating!!!")
    }
}
//Subclass
class Dog(name: String, val breed: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks: Woof! Woof!")
    }

    fun wagTail() {
        println("$name is wagging its tail")
    }
}

fun main()
{
    val animal = Animal("Generic Animal")
    animal.makeSound()
    animal.eat()

    println("=====================================================")
    val dog = Dog("Buddy", "Golden Retriever")
    dog.makeSound()
    dog.eat()
    dog.wagTail()
    println("Breed: ${dog.breed}")
    println("=====================================================")

}