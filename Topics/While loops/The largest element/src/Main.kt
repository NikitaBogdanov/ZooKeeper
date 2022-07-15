fun main() {
    // put your code here
    var largest = Int.MIN_VALUE
    var l = true
    while (l) {
        val inp = readln().toInt()
        if (inp > largest) largest = inp
        if (inp == 0) l = false
    }
    println(largest)
}