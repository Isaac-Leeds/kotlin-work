// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val string = "Hello, World!"
    println(string.howMany { it.isUpperCase()})
    println(string.howMany {it in 'a'..'j'})
    println(string.howMany {it in '!'..'/'})
}
