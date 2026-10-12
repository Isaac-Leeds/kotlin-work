// Task 5.4.1: main program
fun main(args: Array<String>) {
    val testString1 = "this is too long of a string for this function it will return false"
    val testString2 = "this is okay"
    println(testString1.isTooLong)
    println(testString2.isTooLong)
}