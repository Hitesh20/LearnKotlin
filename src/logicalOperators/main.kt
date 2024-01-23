package logicalOperators

fun main(args: Array<String>) {
    var above70 = false
    var knowsProgramming = false

    // AND
    var getInterviewCall = above70 && knowsProgramming
    println(getInterviewCall)


    // OR
    above70 = false
    knowsProgramming = true
    getInterviewCall = above70 || knowsProgramming
    println(getInterviewCall)

    // Short Circuiting
    var i = 10
    var j = 11

    var result = i == 10 || j++ == 11 // after ||, condition did not evaluate.. therefore, this is shortcircuiting
    println(i)
    println(j)

    // Negate
    println(!false)
}