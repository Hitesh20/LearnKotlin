package collections

fun main(args: Array<String>) {
    val nums = listOf(1,2,3,4,5,6) // this is immutable list
    println(nums.indexOf(4))
    println(nums[1])
    println(nums.indexOf(10))
//    nums.addLast(7) // Error, as we are trying to update immutable list
    for (num in nums) {
        println(num)
    }
    println("--------------------------------------")

    var nums2 = mutableListOf(1,2,3,4)
    nums2.add(5)
    nums2[4] = 5
    println(nums2.get(4))

    nums2.addAll(nums)
    for ((index, element) in nums2.withIndex()) {
        println("${index} - ${element}")
    }


    // MAPS

    var map: MutableMap<Int, String> = mutableMapOf<Int, String>() // Dictionary
    map.put(1, "Hitesh")
    map.put(2, "JDK")
    map.put(3, "Abhinandan")

    println(map.get(2))
    println(map.get(5))

    map[5] = "Udita"
    for((key, value) in map) {
        println("$key - $value")
    }

    var map2 = mapOf<Int, String>(1 to "Hello", 2 to "World", 4 to "India") // no put method for this
    for((key, value) in map2) {
        println("$key - $value")
    }
}