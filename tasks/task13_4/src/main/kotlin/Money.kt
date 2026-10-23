// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int){
    init{
        require(euros>=0) {"Must have non-negative euros"}
        require(cents>=0) {"Must have non-negative cents"}
        require(cents<=99) {"Must have less than 100 cents"}
    }

    operator fun plus(other: Money) = Money(euros+other.euros + (cents+other.cents)/100, (cents+other.cents).mod(100))
}