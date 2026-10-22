// Task 12.5.3: demo program for class with custom setter
fun main() {
    val person = Person("John", kotlinx.datetime.LocalDate(1990, 5, 15))

    // Uncommenting the following line will throw an exception
    person.name = "" // Throws IllegalArgumentException: Name cannot be blank
}