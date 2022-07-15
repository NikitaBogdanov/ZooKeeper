fun main() {
    // put your code here
    val hour1 = readln().toInt()
    val min1 = readln().toInt()
    val sec1 = readln().toInt()
    val hour2 = readln().toInt()
    val min2 = readln().toInt()
    val sec2 = readln().toInt()

    println((sec2 + (min2 + 60 * hour2) * 60) - (sec1 + (min1 + 60 * hour1) * 60))
}