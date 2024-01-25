package scopedFunctions

fun main(args: Array<String>) {
    val emp1 = Employee()
    emp1.id = 1
    emp1.name = "Hitesh"
    emp1.age = 24

    // to reduce this redundency of typing emp1.blah
    emp1.apply {// in this scope, this keyword is present which is pointing to emp1 object...
        // the return type of this function is Employee only
        id = 4
        age = 50
        name = "Rahul"
    }

    println(emp1)

    println(emp1.age)
    println(emp1.name)

    emp1.let { // last value returned is the return type in this... it has access to it variable...
        println(it.name)
        println(it.age)
    }

    with(emp1) {// last value returned is the return type in this..
        age = 14
        name = "Ganpat"
    }

    emp1.run {
        age = 36
        name = "Paaazziii"
    }
}

data class Employee(var id: Int = -1, var name: String = "", var age: Int = 18)