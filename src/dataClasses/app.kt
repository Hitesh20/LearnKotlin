package dataClasses

fun main(args: Array<String>) {
    val p1 = Person(1, "Hitesh")
    val p2 = Person(1, "Hitesh")
    println(p1) // with data class... toString method is already overwritten
    println(p1.hashCode())
    println(p2)
    println(p1 == p2) // with data class, it compares value in the objects... without data class, it compares references...

    // data classes has some utility functions as well...
    val p3 = p1.copy()
    println(p3)

    val p4 = p1.copy(id = 4, name = "Munjal") // while copying, can change value
    println(p4)

    // destructuring
    val (id, name) = p4 // this internally calls component only
    println(id)
    println(name)

    // another way of fetching data
    println(p4.component1())
    println(p4.component2())
}

data class Person(val id: Int, val name: String) { // these are dao classes... no need to create getter and setters

}