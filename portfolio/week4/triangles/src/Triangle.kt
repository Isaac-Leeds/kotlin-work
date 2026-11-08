// COMP2850 Portfolio: Week 4
// Triangle class
import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(isValid()) { "Invalid triangle sides: $sideA, $sideB, $sideC" }
    }

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }

    val perimeter get() =  sideA + sideB + sideC   // compute perimeter of a triangle
    val semiPerimeter get() =  perimeter / 2   // compute semi-perimeter of a triangle
    val area: Double get(){ 
        val s = (sideA + sideB + sideC) / 2
        val area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        return area
    } 

    fun isValid(): Boolean {
        var valid = true
        if (sideA + sideB <= sideC) {
            valid = false
        }
        if (sideA + sideC <= sideB) {
            valid = false
        }
        if (sideB + sideC <= sideA) {
            valid = false
        }
        return valid
    }

    fun area(): Double {
        val s = (sideA + sideB + sideC) / 2
        val area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        return area
    }

}
