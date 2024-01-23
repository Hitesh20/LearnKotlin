package oops.classes

fun main(args: Array<String>) {
    val calculator = Calculator()
    println(calculator.add(4,5))

    val p1 = Person4("Hitesh", 24)
    println(p1.age)
    p1.age = 25 // this will invoke setter method
    println(p1.age)
    p1.age = -12
    println(p1.name) // this will invoke getter method
}

class Calculator { // parameterless constructor

    lateinit var message: String // either create constructor or use lateinit to define that its value will be initialized later.. it can only be var
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

class Person4(name: String, age: Int) {
    var name: String = name
        get() {
            println("Getter method gets called")
            return field.uppercase()
        }
    var age: Int = age
        set(value) { // to set value, write set directly beneathe the property
            if(value > 0) {
                field = value
            } else {
                println("Age can not be negetive")
            }
        }
}