//Student Account class

package comp2850.banking
val MAX_OVERDRAFT = 1000
class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft = 0
        set(value) {
            require(value >= 0) { "Overdraft cannot be negative" }
            require(value <= MAX_OVERDRAFT) { "Overdraft cannot exceed $MAX_OVERDRAFT" }
            field = value
        }


    fun withdrawalsAllowed() = (balance > 0-overdraft)

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance - amount >= -overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }
}