fun main() {
    // put your code here
    val n = readln().toInt()
    var num = 1
    while (num * num <= n) {
        println(num * num)
        ++num
    }
}