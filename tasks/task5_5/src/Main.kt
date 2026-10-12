// Task 5.1.1: main program
fun main(args: Array<String>) {
    when (args[0] anagramOf args[1]) {
        true -> println("The strings are anagrams.")
        false -> println("The strings are not anagrams.")
    }
}