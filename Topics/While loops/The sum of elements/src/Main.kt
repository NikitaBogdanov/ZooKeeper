fun main() {
    // put your code here
    var input = Int.MIN_VALUE
    var sum = 0
    while (input != 0) {
        input = readln().toInt()
        sum += input
    }
    println(sum)
}