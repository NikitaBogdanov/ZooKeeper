fun main() {
    // put your code here
    val height1 = readln().toInt()
    val height2 = readln().toInt()
    val height3 = readln().toInt()

    val res = height1 <= height2 && height2 <= height3 || height3 <= height2 && height2 <= height1
    println(res)
}