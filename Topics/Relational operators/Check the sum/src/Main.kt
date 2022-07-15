fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    val res = (num1 + num2 == 20) || (num1 + num3 == 20) || (num2 + num3 == 20)
    println(res)
}