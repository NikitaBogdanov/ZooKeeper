fun main() {
    // put your code here
    var groupCount = 0
    var output = 0
    val su = 1
    val di = 3
    val cu = su..di
    for (number in cu) {
        groupCount = readln().toInt()
        if (groupCount % 2 > 0) {
            output = output + groupCount / 2 + 1
        } else {
            output = output + groupCount / 2
        }
    }
    println(output)
}
