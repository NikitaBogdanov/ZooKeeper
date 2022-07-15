fun main() {
    // put your code here
    var max = 0
    repeat(readln().toInt()) {
        val ch = readln().toInt()
        if (ch % 4 == 0 && ch > max) max = ch
    }
    println(max)
}