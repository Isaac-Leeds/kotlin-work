// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val data = fetchData(args[0])
    println("Lowest: ${data.minBy { it.second }}")
    println("Highest: ${data.maxBy { it.second }}")
    println("Average: %.2f".format(data.map { it.second }.average()))
}