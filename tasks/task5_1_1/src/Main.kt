// Task 5.1.1: main program
fun main(args: Array<String>) {
    when (anagrams(args[0], args[1])) {
        true -> println("The strings are anagrams.")
        false -> println("The strings are not anagrams.")
    }
}