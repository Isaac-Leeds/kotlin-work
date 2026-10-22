// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(1.0, 2.0)
    println("Point coordinates: (${p.x}, ${p.y})")
    println("Distance from origin: ${p.distance()}")
    println("Distance to point (4.5, 7.0): ${p.distanceTo(Point(4.5, 7.0))}")
}