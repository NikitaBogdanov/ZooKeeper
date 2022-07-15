fun main() {
    // put your code here
    val n = readln().toInt()
    var count = 0
    var i = 0
    var output = ""
    while (i <= n) {
        ++count
        repeat(count) {
            ++i
            if (i <= n) output += "$count "
        }
    }
    println(output.trim())
}