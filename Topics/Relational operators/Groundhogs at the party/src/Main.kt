fun main() {
    // write your code here
    val cupsCount = readln().toInt()
    val weekendOrNot = readln().toBoolean()
    if (weekendOrNot) {
        println(cupsCount in 15..25)
    } else {
        println(cupsCount in 10..20)
    }
}