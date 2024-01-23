package oops.classes

fun main(args: Array<String>) {
    val mustang = Car("mustang", "petrol", 100)
    val beetle = Car("beetle", "diesel", 200)

    println(mustang)
    println(beetle.name)
    println(mustang.driveCar())
}

// car class car and defining properties
class Car (val name: String, val type: String, var kmRan: Int) { // this is primary constructor
    fun driveCar() {
        println("$name Car is driving")
    }
    fun applyBrakes() {
        println("Brakes are applied by $name")
    }
}