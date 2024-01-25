package higherOrderFunctions

fun main(args: Array<String>) {

    val nums: List<Int> = listOf(1,2,3,4,5,6,7)
    val oddNums = nums.filter(::isOdd)
    println(oddNums)
    val evenNums2: List<Int> = nums.filter(fun(num: Int): Boolean {return num % 2 == 0})
    println(evenNums2)
    val evenNums3: List<Int> = nums.filter({num: Int -> num % 2 == 0})
    println(evenNums3)
    val evenNums4: List<Int> = nums.filter {num: Int -> num % 2 == 0}
    println(evenNums4)
    val evenNums: List<Int> = nums.filter { it % 2 == 0 }
    println(evenNums)

    val getSquare = nums.map { it * it }
    println(getSquare)
    nums.forEach { println(it) }
}

fun isOdd(num: Int): Boolean {
    return num % 2 != 0
}