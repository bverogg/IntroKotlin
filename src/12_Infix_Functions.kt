// Have a single parameter
// Infix keyword
// It gives us the ability to use functions as if they were arithmetic operators.

infix fun String.remove(text: String):String {
    return this.replace(text, "")
}

class Label(var content:String)

fun main() {

    // Example 1 : Pair<A,B>
    // se utiliza en mapas
    // Estructura tipo par
    val pair1 = 1.to("one")
    val pair2 = 2.to("two")
    val pair3 = 3 to "three"


    // Example 2 : Until
    for(i in 1 until 10){
        println(i)
    }

    // Custom Example 1
    val myText = "Hello this is my text"
    val result = myText remove "text"
    println(result)

    // Custom Example 2


    println(pair1)
}