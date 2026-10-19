// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1) { "Please provide a filename as a command line argument" }
    try{
         val list = readData(args[0])
    println("Size of dataset is ${list.size}")

    println("Variance of dataset is %.5f".format(variance(list)))

    }
    catch (error: NoSuchFileException) {
        println("File not found")
        exitProcess(1)
    }
    catch (error: Exception) {
        println("An error occurred")
        exitProcess(1)
    }
}