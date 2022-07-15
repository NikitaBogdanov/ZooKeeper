fun main() {
    // put your code here
    val input = readln().toInt()
    println(input % 10 * 100 + input / 10 % 10 * 10 + input / 100)
}