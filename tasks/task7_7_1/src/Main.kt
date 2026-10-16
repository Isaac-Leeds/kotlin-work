// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: program <filename>")
        return
    }
    val data = readData(args[0])
    stats(data)
}