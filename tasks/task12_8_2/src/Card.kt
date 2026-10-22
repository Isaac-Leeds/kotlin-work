// Task 12.8.2: class to represent playing cards
class Card(val rank: Rank, val suit: Suit){
    val fullName get() = rank.toString() + " of " + suit.toString()

    override fun toString() = rank.symbol+""+suit.symbol
}