fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    println(
        listOf(num1, num2, num3)
        .filter { it > 0 }
        .size == 1
    )
}
