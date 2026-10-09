// Task 4.7: finding the longest line in a file
fun main(args: Array<String>){
    val filePath = Path(args[0])
    var longestLine = ""
    var longestLineNum = 0
    var LineNum = 0
    filePath.forEachLine {
        LineNum++
        if (it.length > longestLine.length) {
            longestLine = it
            longestLineNum = LineNum
        }
    }
    println("Longest line: $longestLine")
    println("Line number: $longestLineNum")
}