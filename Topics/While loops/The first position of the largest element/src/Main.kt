import java.util.*

fun main() {
    // put your code here
    var max = Int.MIN_VALUE
    var pos = 1
    var finPos = 1
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        if (next > max) {
            max = next
            finPos = pos
        }
        ++pos
    }
    println("$max $finPos")
}