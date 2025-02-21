package day3.oopdemo.abtraction

fun main() {
    val chicken = Chicken()
    val dog = Dog()

    println("Dog says: ${dog.makeSound()}")
    println("Chicken says: ${chicken.makeSound()}")
}