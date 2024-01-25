package variableArgs

fun main(args: Array<String>) {
    doSum(1,2,3,4,5,6,7,8)
}

fun doSum(vararg value: Int) { // with vararg we can pass any number of arguments...
    var sum = 0
    for (i in value) {
        sum += i;
    }
    println(sum)
}