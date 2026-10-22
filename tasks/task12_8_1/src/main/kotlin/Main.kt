// Task 12.8.1: demo program for Day enum class
fun main(){
    println("Enter day: ")
    val daystr = readln() 
    try{
        val day = Day.valueOf(daystr)
    }
    catch (error.IllegalArgumentException){
        println("${daystr} is not a valid day")
    }
}