fun main() {
    // put your code here
    val durationInDays = readln().toInt()
    val totalFoodCostPerDay = readln().toInt()
    val oneWayFlightCost = readln().toInt()
    val costOfOneNightHotel = readln().toInt()
    
    println(durationInDays * totalFoodCostPerDay + (durationInDays - 1) * costOfOneNightHotel + 2 * oneWayFlightCost)
    
}
