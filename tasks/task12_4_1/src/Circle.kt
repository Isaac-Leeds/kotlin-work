// Task 12.4.1: Circle class
import kotlin.math.PI
class Circle(val center: Point, val radius: Double) {
    init {
        require(radius > 0) { "Radius must be positive" }
    }
    fun area() = Math.PI * radius * radius
    fun perimeter() = 2 * Math.PI * radius
    infix fun contains(point: Point): Boolean {
        val distance = center.distanceTo(point)
        return distance <= radius
    }
}