// Task 15.2.3: SavingsAccount class
import kotlin.math.floor

class SavingsAccount(holder: String, val rate: Float): BankAccount(holder){
    init{
        require(rate>0) {"Interest rate must be greater than 0"}
    }

    fun applyInterest(){
        deposit(floor(balance*rate).toInt())
    }
}