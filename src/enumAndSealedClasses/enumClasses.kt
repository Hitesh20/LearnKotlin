package enumAndSealedClasses

fun main(args: Array<String>) {
    val today: Days = Days.Thursday
    println(today)

    val sunday = Day.Sunday
    println(sunday)
    println(sunday.number)

    for(day in Day.values()) {
        println(day)
    }

    for(entry in Day.entries) {
        println("${entry.name} - ${entry.number}")
    }

    println(sunday.printFormattedDay())
}

enum class Day(val number: Int) {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7); // ; is necessary if we want to declare functions.. to let compiler know that we have no more values to add in this enum class

    fun printFormattedDay() {
        println("Day is $this")
    }
}

enum class Days {
    Monday, // it is an instance or object of Days
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}