fun main() {
    // put your code here
    var a = 0 // 5
    var b = 0 // 4
    var c = 0 // 3
    var d = 0 //2

    repeat(readln().toInt()) {
        val mark = readln().toInt()
        when (mark) {
            5 -> ++a
            4 -> ++b
            3 -> ++c
            2 -> ++d
            else -> println("Wrong mark")
        }
    }
    println("$d $c $b $a")
}