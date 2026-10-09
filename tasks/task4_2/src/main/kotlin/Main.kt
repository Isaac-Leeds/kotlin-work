// Task 4.2: use of if and ranges


fun main() {
    println("[a] Cheese\n[b] Pepperoni\n[c] Sausage\n[d] Veggie")
    println("Enter your choice: ")
    var choice = readln()
    if (choice.lowercase() in "a".."d" && choice.length == 1) {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}
