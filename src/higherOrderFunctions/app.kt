package higherOrderFunctions

import kotlin.math.pow

fun main(args: Array<String>) {
    var addFun = ::sum // functions are first class citizens... they are treated like objects... function can be passed as argument, can be returned... function can return function as well
    var powFun : (num1: Double, num2: Double) -> Double = ::power

    println(addFun(2.0, 4.0))

    // Higher Order Function - accepts function as argument or return functions or both
    calculator(5.0, 7.0, addFun)
    calculator(5.0, 7.0, ::sum)
}

fun sum(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun power(num1: Double, num2: Double): Double {
    return num1.pow(num2)
}

fun calculator(num1: Double, num2: Double, gn: (Double, Double) -> Double) {
    val result = gn(num1, num2)
    println(result)
}