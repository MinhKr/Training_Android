package day3.oopdemo.polymorphism


fun main() {
    val animals: List<Animal> = listOf(
        Dog(),
        Chicken()
    )

    for (animal in animals){
        animal.makeSound()
    }
}