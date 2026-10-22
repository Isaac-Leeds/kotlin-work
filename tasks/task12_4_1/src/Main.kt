// Task 12.4.1: main program
fun main() {
    val c = Circle(Point(1.0, 2.0), 3.0)
    println("Circle center: (${c.center.x}, ${c.center.y}), radius: ${c.radius}")
    println("Area: ${c.area()}")
    println("Perimeter: ${c.perimeter()}")
    val p1 = Point(2.0, 3.0)
    println("Point (${p1.x}, ${p1.y}) is inside the circle: ${c contains p1}")
}