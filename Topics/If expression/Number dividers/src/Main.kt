fun main() {
    // put your code here
    val input = readln().toInt()
    val interval = 2..6
    for (i in interval) {
        if (i != 4) {
            if (input % i == 0) println("Divided by $i")
        }
    }
}