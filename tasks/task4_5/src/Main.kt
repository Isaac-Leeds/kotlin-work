// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    var total: ULong = 0u
    for (i in 1..(args[0].toInt()) step 2) {
        total+=i.toULong()
    }
    println(total)
}
