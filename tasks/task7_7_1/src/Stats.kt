// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {
    val sorted = numbers.sorted()
    if (sorted.size %2 == 0){
        return (sorted[sorted.size/2]+sorted[sorted.size/2-1])/2
    }
    return sorted[sorted.size/2]
}
fun stats(numbers: List<Float>){
    println("Mean: ${numbers.average()}")
    println("Median: ${median(numbers)}")
    println("Max: ${numbers.maxOrNull()}")
    println("Min: ${numbers.minOrNull()}")
}