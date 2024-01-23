package oops.classes

fun main(args: Array<String>) {
    val onePlus = OnePlus()
    onePlus.display()

    val onePlus2: Mobile = OnePlus()
    onePlus2.display()
    println(onePlus2.size)

    val nord = Nord("Nord1")
    println(nord.name)

    val samsung = Samsung("Samsung")
    println(samsung.name)
}

open class Mobile {
    open val name: String = "" // allowing override
    open val size: Int = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display") // to allow overriding
}

open class OnePlus: Mobile() {
    override val name: String = "One Plus"
    override val size: Int = 7
    override fun display() {
        println("One Plus Display")
    }
}

class Nord(override val name: String): OnePlus() {
}

class Samsung(nameParam: String): OnePlus() {
    override val name: String = nameParam
}