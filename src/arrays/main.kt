package arrays

fun main(args: Array<String>) {
    // array is of fix size
    var arr1 = arrayOf("One", "Two", "Three", "Four")
    println(arr1) // returns reference
    println(arr1[0])
    println(arr1.size)

    // defing type explicitly
    var arr2 = arrayOf<Int>(1,2,3,4)

    println(arr2.get(1))
    arr2.set(1, 5)
    println(arr2.get(1))
    arr2[1] = 2
    println(arr2[1])

    var arr3: Array<Double> = arrayOf<Double>(2.3,4.0,6.0)
    println(arr3[2])

    println("------------------------------------------")
    // print elements only
    for(num in arr2) {
        println(num)
    }
    println("------------------------------------------")
//    print elemnts as well as index
    for((index, element) in arr1.withIndex()) {
        println("$index - $element")
    }
    println("------------------------------------------")
    for((index, element) in arr1.reversed().withIndex()) { // .reversed() do not change original array
        println("$index - $element")
    }


}