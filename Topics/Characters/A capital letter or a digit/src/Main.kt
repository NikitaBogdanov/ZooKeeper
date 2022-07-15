fun main() {
    // write your code here
    val ch: Char = readln().first()
    var output = false
    if (ch.isDigit() && ch.toString().toInt() == 0) {
        output = false
    } else {
        if (ch.isDigit()) {
            output = true
        }
    }
    if (ch.isUpperCase()) {
        output = true
    }
    println(output)
}