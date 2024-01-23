package functionAndDefaultArgs

fun main(args: Array<String>) {
    println(add(5,6))
    isEven(9)
    isOdd(9)
    println(multiply(4,6))
    println(subtract(8,3))
    printMessage(3) // argument
    printMessage()
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2;
}

fun isEven(num: Int) { // If no return type is provided, then it is of type Unit
    println(if(num % 2 == 0) "Even" else "Odd")
}

fun isOdd(num: Int): Unit {
    println(if(num % 2 != 0) "Odd" else "Even")
}

// Making inline function
fun multiply(num1: Int, num2: Int): Int = num1 * num2

fun subtract(num1: Int, num2: Int) = num1 * num2 // return should be Int only, so no need to write it

// Default arguments
fun printMessage(count: Int = 5) { // parameters
//     count = 9 // parameters can not be reassigned... parameters are of type val...
    for (i in 1..count) {
        println("Hello $i")
    }
}