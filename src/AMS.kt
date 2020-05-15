import kotlin.random.Random as Random

fun main() {
    feedTheFish()
    swim()
    swim("slow")
    swim(speed = "Turtle bike")
    val decorations = listOf("rocks","pagoda","flowerpot","plastic","plant", "alligator")
    val eager = (decorations.filter { it[0]=='p' })
    println("eager$eager")
    val filtered = (decorations.asSequence().filter { it[0] =='p' })
    println("filtered $filtered")
    val newList = filtered.toList()
    println("new list $newList")
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${ lazyMap2.toList() }")
}
fun feedTheFish() {
    val day= randomDay()
    val food = fishFood(day)
    println( "Today is $day and the fish ${if(food == "Fasting") "doesn't eat anything" else "eat $food"}")
    println("Need to Change Water : ${shouldChangeWater(day)}")
}
fun randomDay(): String {
     val week= listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random.nextInt(week.size)]
}
fun fishFood(day: String) : String {
    //var food : String
     return when(day){
        "Sunday" ->   "flakes"
        "Monday" ->  "Granules"
        "Tuesday" -> "Lamitoes"
        "Wednesday" ->  "Rajma Chawal"
        "Saturday" ->  "Redworms"
        else ->  "Fasting"
    }
    //return food
}
fun swim(speed: String = "Fast") {
    println("Fish swims $speed")
}
fun shouldChangeWater(day: String, temperature: Int = 22, dirty : Int = 20) : Boolean {
    return when
    {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true

        else -> false
    }
}