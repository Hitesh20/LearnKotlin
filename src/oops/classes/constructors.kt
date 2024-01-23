package oops.classes

fun main(args: Array<String>) {
    var p1 = Person()
    println("${p1.name} - ${p1.age}")

    var p2 = Person2()
    println("${p2.name} - ${p2.age}")

    var p3 = Person3("Hitesh", 23)
    println("${p3.name} - ${p3.age}. Can Vote:- ${p3.canVote}")

    val automobile = Automobile("Jaguar", "Petrol", 3000, true)
    println(automobile.airBags)

    val mustang = Car2("mustang", "petrol", 100, 10, 6) // this calls primary constructor.
    val beetle = Car2("beetle", "diesel", 200) // this calls secondary constructor.

    println(mustang.tyres)
    println(beetle.tyres)
}

class Person() { // empty constructor
    var age: Int = 0
    var name: String = "No Name"
}

class Person2 { // empty constructor
    var age: Int = 2
    var name: String = "No Name 2"
}

class Person3(nameParam: String, ageParam: Int) { // this is to initialize properties
    var age: Int = ageParam
    var name: String = nameParam + " Munjal"  // we can modify this way
    val canVote: Boolean = age >= 18 // created property based on param
}

class Automobile(val name: String, val type: String, var kmRan: Int, hasAirBags: Boolean) { // if you use var or val - it creates a property... otherwise it is a param
    init { // this is initializer block
        println("$name created")
//        println("Airbags:- $airBags") // Error - airBags not initialized
    }
    val airBags: Boolean = hasAirBags;
    init {
        println("Airbags:- $airBags")
    }
    fun driveCar() {
        println("$name Car is driving")
    }
    fun applyBrakes() {
        println("Brakes are applied by $name")
    }
}

class Car2 (val name: String, val type: String, var kmRan: Int, val seatingCap: Int, val tyres: Int) { // this is primary constructor
    // this is secondary constructor // in secondary constructor, it is mandatory to call its primary constructor..
    constructor(nameParam: String, typeParam: String, kmRanParam: Int):
            this(nameParam, typeParam, kmRanParam, 5, 4)

    // this is secondory constructor

    fun driveCar() {
        println("$name Car is driving")
    }
    fun applyBrakes() {
        println("Brakes are applied by $name")
    }
}