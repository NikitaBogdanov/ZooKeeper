import kotlin.math.*

fun main() {
    // write your code here
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    println(
        if (x1 == x2) {
            "YES"
        } else if (y1 == y2) {
            "YES"
        } else if (abs(x1 - x2) == abs(y1 - y2)) "YES" else "NO"
    )

}