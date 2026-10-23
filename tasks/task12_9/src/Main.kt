// Task 12.9: demo program for class implementing Static Factory Method
fun main(){
    val p = Person.create("Tanya", kotlinx.datetime.LocalDate(1990, 5, 15))
    val p2 = Person.create("Tanya", kotlinx.datetime.LocalDate(2007,3,13))
}