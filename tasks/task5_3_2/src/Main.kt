// Task 5.3.2: main program
fun main(args: Array<String>) {
    val rolls = args[0].split("d")[0].toInt()
    val sides = args[0].split("d")[1].toInt()
    rollDice(sides, rolls)
}