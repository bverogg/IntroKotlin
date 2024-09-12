fun main() {

    // EXAMPLE 1
    val x = 21
    val y = 20

    if(x >= y){
        println("$x >= $y")
    }else{
       println("$y > $x")
    }
    // EXAMPLE 2 . If as an expression
    val answer = if(x >= y) "$x >= $y" else "$y > $x"
    println(answer)
}