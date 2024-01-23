package functionOverloading

fun main(args: Array<String>) {
    // function overloading is same as Java
    // no of args can be different or their type
    println(add(8, 9))
    println(add(4.6, 3.7))
    println(add(num2 = 4.2, num1 = 3.7)) // these are named args

    // storing functions in variable
//    var fn = ::add // overloaded function overloading ambiguity

    val subtractFun = ::subtract
    println(subtractFun(5,1))

    val multiplyFun: (num1: Int, num2: Int) -> Int = ::multiply // type of multiplyFun is declared
    println(multiplyFun(5,6))


}

fun subtract(num1: Int, num2:Int): Int {
    return num1 - num2
}

fun multiply(num1: Int, num2:Int): Int {
    return num1 * num2
}

fun add(num1: Int, num2:Int): Int {
    return num1 + num2
}

fun add(num1: Double, num2:Double): Double {
    return num1 + num2
}