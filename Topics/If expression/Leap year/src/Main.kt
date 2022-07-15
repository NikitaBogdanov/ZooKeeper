fun main() {
    // write your code here
    val input = readln().toInt()
    println(
        if ((input % 4 == 0 && input % 100 > 0) || input % 400 == 0) "Leap" else "Regular"
    )
}