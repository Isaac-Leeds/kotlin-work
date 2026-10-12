// Task 4.7: finding the longest line in a file
import kotlin.io.path.*
fun main(args: Array<String>){
    val filePath = Path(args[0])
    var longestLine = ""
    var longestLineNum = 0
    var lineNum = 0
    filePath.forEachLine {
        lineNum++
        if (it.length > longestLine.length) {
            longestLine = it
            longestLineNum = lineNum
        }
    }
    println("Longest line: $longestLine")
    println("Line number: $longestLineNum")
}