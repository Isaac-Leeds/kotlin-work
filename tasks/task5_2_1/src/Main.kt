// Task 5.2.1: main program
import kotlin.math.PI
fun circlePerimeter(radius: Double) = 2 * Math.PI * radius

fun main(args: Array<String>) {
    val radius = args[0].toDouble()
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)
    println("Radius: %.4f".format(radius))
    println("Area: %.4f".format(area))
    println("Perimeter: %.4f".format(perimeter))
}