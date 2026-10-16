// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, censor: String, replacement: Char='X'): String {
    return document.replace(censor, replacement.toString().repeat(censor.length))
}
