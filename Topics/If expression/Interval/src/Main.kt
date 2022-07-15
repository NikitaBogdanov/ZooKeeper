fun main() {
    // write your code here
    val input = readln().toInt()
    println(
        if ((input > -15 && input <= 12) || input == 15 || input == 16 || input >= 19) "True" else "False"
    )
}