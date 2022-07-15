fun main() {
    // put your code here
    var n = readln().toInt()
    var res = "$n"
    while (n != 1) {
        if (n % 2 == 0) n = n / 2 else n = n * 3 + 1
        res = res + " $n"
        }
    println(res)
}