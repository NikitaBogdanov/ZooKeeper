fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val ch = numbers.first()
    numbers[0] = numbers.last()
    numbers[numbers.size - 1] = ch
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}