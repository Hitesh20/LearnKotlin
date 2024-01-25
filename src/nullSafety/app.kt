package nullSafety

fun main(args: Array<String>) {
    var gender: String = "Male"
    val gender2: String? = null // This is Nullable type object // it means it can accept values as well as null
    var isAdult: Boolean? = true

    // null pointer handling
    if (gender2 != null) {
        println(gender2.uppercase())
    }

    println(gender2?.uppercase()) // if gender2 is null.. it will not call uppercase... // safe call operator

    // execute multiple statements if the object is not null

    gender2?.let {
        println("line 1")
        println("line 2 $gender2")
        println("Line 3 $it") // here it refers to gender2
    }

    gender.let {
        println("Line 3 $it")
    }

    var selectedValue = gender2 ?: "NA" // elvis operator // if gender2 is not null return gender2 or elase return the default value after elvis operator
    var value = gender2!!.uppercase() // if gender2 is not null then call uppercase otherwise throw exception
}