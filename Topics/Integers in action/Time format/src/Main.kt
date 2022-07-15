fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code

    val hours = (totalSeconds - totalSeconds / 86400 * 86400) / 3600
    val minutes = (totalSeconds - totalSeconds / 3600 * 3600) / 60
    val seconds = (totalSeconds - totalSeconds / 60 * 60)

    println("$hours:$minutes:$seconds")
}
