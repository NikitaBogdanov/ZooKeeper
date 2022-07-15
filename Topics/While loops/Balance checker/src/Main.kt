import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var enough = true
    while (scanner.hasNextInt()) {
        // TODO
        val next = scanner.nextInt()
        if (balance - next < 0) {
            enough = false
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $next.")
        } else balance = balance - next
    }
    // TODO
    if (enough) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}