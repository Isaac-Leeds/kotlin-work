// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    var input = ""
    var db = createDatabase()
    while (input!="quit"){
        println("Name: ")
        val name = readln()
        db.load(CSV_FILENAME)
        if (name == "quit") {break}
        else if(name in db.keys){
            println("Number: ${db[name]}")
        }
        else{
            println("Number: ")
            val number = readln()
            db[name] = number
            db.save(CSV_FILENAME)
        }
    }
}
