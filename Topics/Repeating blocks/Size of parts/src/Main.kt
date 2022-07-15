fun main() {
    // put your code here
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(readln().toInt()) {
        when (readln().toInt()) {
            1 -> ++larger
            0 -> ++perfect
            -1 -> ++smaller
        }
    }
    println("$perfect $larger $smaller")
}
