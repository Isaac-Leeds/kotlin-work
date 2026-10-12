// Task 5.3.2: rollDice() function
import kotlin.random.Random
fun rollDice(sides: Int = 6, rolls: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0
        for (i in 1..rolls){
            total += Random.nextInt(1, sides + 1)
        }
        println("Total: $total")
    }
}