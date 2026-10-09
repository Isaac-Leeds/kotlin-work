// Task 4.3: grade calculation using a when expression
fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Usage: kotlin run <mark1> <mark2> <mark3>")
        return
    }
    val mark1 = args[0].toIntOrNull()
    val mark2 = args[1].toIntOrNull()
    val mark3 = args[2].toIntOrNull()
    if (mark1 == null || mark2 == null || mark3 == null) {
        println("Usage: kotlin run <mark1> <mark2> <mark3>")
        return
    }
    val avg = (mark1 + mark2 + mark3) / 3
    val grade = when (avg) {
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> "Invalid marks"
    }
    println("Average: " + avg + ", Grade: " + grade)
}