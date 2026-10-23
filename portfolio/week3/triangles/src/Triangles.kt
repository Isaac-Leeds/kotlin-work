// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    var valid = true
    if (triangle.first + triangle.second <= triangle.third) {
        valid = false
    }
    if (triangle.first + triangle.third <= triangle.second) {
        valid = false
    }
    if (triangle.second + triangle.third <= triangle.first) {
        valid = false
    }
    return valid
}

fun triangleArea(triangle: Triangle): Double {

    require(isValidTriangle(triangle))
    val s = (triangle.first + triangle.second + triangle.third) / 2
    val area = sqrt(s * (s - triangle.first) * (s - triangle.second) * (s - triangle.third))
    return area
}
