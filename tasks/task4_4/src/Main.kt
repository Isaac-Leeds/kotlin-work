// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    val initialTemp = args[0].toDouble()
    val finalTemp = args[1].toDouble()
    val increment = args[2].toDouble()
    var i = initialTemp
    while (i <= finalTemp) {
        println("" + i + "C|" + (i * 9/5 + 32) + "F")
        i += increment
    }
}
