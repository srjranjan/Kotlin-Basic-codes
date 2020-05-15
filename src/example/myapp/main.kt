package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.size()
    val myAquarium1 = Aquarium(width=44)
    myAquarium1.size()
    val myAquarium2 = Aquarium()
    myAquarium2.size()
    val myAquarium3 = Aquarium( length = 80, height = 25)
    myAquarium3.size()
    val myAuarium4=Aquarium(numberOfFish = 29)
    myAuarium4.size()
    println("Volume : ${myAuarium4.height*myAuarium4.width*myAuarium4.height/1000}")
}
fun main() {
    buildAquarium()
}

class Aquarium(
        val length: Int = 100,
        val width: Int = 40,
        var height: Int = 20
) {
    init {
        println("aqurium initializing")
    }
    init {
        println("Volume : ${length * width * height} litres")
    }
    fun size() {
        println("""
                Length = $length cm  
                Width = $width cm 
                Height = $height
                """.trimIndent())
    }
constructor(numberOfFish : Int):this(){
    val tank = (numberOfFish* 2000 * 1.1).toInt()
    height = tank/(length+width)

}
}

