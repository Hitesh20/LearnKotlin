package oops.classes

fun main(args: Array<String>) {
    val phone = BasicPhone()
    println(phone.getScreenInfo())
    println(phone.display())
}

open class Phone { // open is used to tell kotlin that this class is open for inheritance
    init {
        println("Phone Constructor Called")
    }
    val name: String = ""
    val type: String = ""
    val vol: Int = 10

    fun makeCall() {
        println("Call")
    }
    fun display() {
        println("Display")
    }
}

class BasicPhone: Phone() { // only single inheritance is supported
    init {
        println("Basic Phone Constructor Called")
    }
    fun getScreenInfo() {
        println("In Basic Phone")
    }
}

class SmartPhone: Phone() {
    fun takePicture() {
        println("Picture Taken")
    }
    fun playMovies() {
        println("Movie Played")
    }
}