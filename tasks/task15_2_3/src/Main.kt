// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val saver18 = SavingsAccount("Jimbo", 1.8f)
    saver18.deposit(1250)
    saver18.applyInterest()
    saver18.applyInterest()
    saver18.applyInterest()
    saver18.applyInterest()
    saver18.applyInterest()
    saver18.withdraw(50)
    println("${saver18.holder}, has £${saver18.balance}")
}
