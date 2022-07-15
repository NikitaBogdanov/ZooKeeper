fun main() {
    // put your code here
    val ch1: Char = readln().first()
    val ch2: Char = readln().first()
    val ch3: Char = readln().first()

    var output: Boolean = false
    if (ch1 + 1 == ch2 && ch2 + 1 == ch3) {
        output = true
    }
    println(output)
}