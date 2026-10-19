// Task 9.6: variance() function
fun variance(data: List<Double>): Double {
    require(data.size > 2) { "Variance requires at least 3 data points" }
    val mean = data.average()
    val squaredDifferences = data.map { (it - mean) * (it - mean) }
    return squaredDifferences.sum() / (data.size - 1)
}