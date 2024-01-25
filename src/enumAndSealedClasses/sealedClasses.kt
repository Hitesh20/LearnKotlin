package enumAndSealedClasses

fun main(args: Array<String>) {
    val tile1 = Red("Mushroom", 25)
    val tile: Tile = Red("Fire", 40)
    println("${tile1.type} - ${tile1.points}")

    val points: Int = when(tile) {
        is Red -> tile.points * 2
        is Blue -> tile.points * 3
    }
    println(points)
}

sealed class Tile // it restricts type... like we can create only Red or Blue class...

class Red(val type: String, val points: Int): Tile()

class Blue(val points: Int): Tile()