package rangeAndWhen

fun main(args: Array<String>) {
    val num: Int = 10;
    // check if this no lies in between 1-10
    var result = num in 1..10 // upper bound is included
    println(result)

    result = num in 1 until 10 // upper bound is not included
    println(result)


    val animal = "Dog"
    when(animal) {
        "Horse" -> println("Animal is Horse")
        "Dog" -> println("Animal is Dog")
        "Cat" -> println("Animal is Cat")
        else -> println("Animal not found")
    }

    // can use when as an expression as well
    val animal2 = "Elephant"
    val printResult = when(animal2) {
        "Horse" -> "Animal is Horse"
        "Dog" ->"Animal is Dog"
        "Cat" -> "Animal is Cat"
        else -> "Animal not found"
    }
    println(printResult)

    // can use range as well
    val number: Int = 15
    val resolved = when(number) {
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Greater than 19"
    }
    println(resolved)
}