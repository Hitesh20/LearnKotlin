package higherOrderFunctions

fun main(args: Array<String>) {
    // lambda are anonymous functions
    val lambda1 = {x: Int, y:Int -> x + y}
    val lambda2 = { // last line of lambda is the return type
        println("Hello")
        val a = 2+3
        "Hello Multiline lambda"
        2
    }
    println(lambda2) // returns type i.e. a function
    println(lambda2())

    val singleParamLambda = {x: Int -> x * x}
    println(singleParamLambda(3))

    val singleParamLambda2: (Int) -> Int = {x -> x * x} // type declaration is not needed inside lambda function if variable type is already defined
    println(singleParamLambda2(4))

    val simplifySingleParamLambda2: (Int) -> Int = {it * it} // it refers to the default param passed
    println(simplifySingleParamLambda2(5))

    val singleParamLambda3: (String) -> Unit = {msg -> println("Hello $msg") } // Unit is used because println does not return anything
    println(singleParamLambda3("Hey"))

    calculator2(5.0,6.0, {a, b -> a + b})
    calculator2(5.0,6.0) { a, b -> a + b } // when function is last argument...
}

fun calculator2(num1: Double, num2: Double, gn: (Double, Double) -> Double) {
    val result = gn(num1, num2)
    println(result)
}