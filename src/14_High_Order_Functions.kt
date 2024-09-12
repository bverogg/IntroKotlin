// 1) Receive functions as parameters: They can take functions as arguments.
// 2) Return functions: They can return a function as a result.
// 3) Conciseness: They allow writing more concise code, especially when working with repetitive
//    operations or dynamic actions.

// EXAMPLE 1. Receive function as a parameter
fun operateOnTwoNumbers(a:Int, b:Int, operation:(Int,Int)->Int):Int {
    return operation(a, b)
}

fun multiplyb(a:Int, b:Int):Int = a * b
// EXAMPLE 2. Receives a function as a parameter, and the function receives one parameter only


fun makeMultipler(a:Int, funMultiplier:(Int)->Int):Int{
    return a * funMultiplier(a)
}

fun main(){
    val add = { x: Int, y: Int -> x + y}

    val result = operateOnTwoNumbers(5,10,add)
    val result2 = operateOnTwoNumbers(5,10,::multiplyb)
    val result3 = operateOnTwoNumbers(5,10){ x,y -> x * y }
    // EXAMPLE 4.  Standard High Order functions already implemented in Kotlin
    val result4 = makeMultipler(10){ it * 3 }

    println(result)
    println(result2)
    println(result3)
    println(result4)


}


