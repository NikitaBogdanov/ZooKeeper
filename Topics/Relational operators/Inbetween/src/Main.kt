fun main() {
    // put your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

//    val res1 = num1.first().toString().toInt()
//    val res2 = num2.first().toString().toInt()
//    val res3 = num3.first().toString().toInt()

    println(num1 in minOf(num2, num3)..maxOf(num2, num3))
}