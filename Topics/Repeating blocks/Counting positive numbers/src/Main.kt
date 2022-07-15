fun main() {
    // put your code here
    var posNum = 0
    repeat(readln().toInt()) {
        val seqNum = readln().toInt()
        if (seqNum > 0) ++posNum
    }
    println(posNum)
}