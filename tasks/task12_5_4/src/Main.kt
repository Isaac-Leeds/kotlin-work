// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate
fun main(){
    val p = Person("Jimmeh", LocalDate(1990, 5, 15))
    println(p.age)
}