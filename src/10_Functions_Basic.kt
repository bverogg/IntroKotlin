// EXAMPLE 1. Function Declarations
fun sayHello() {
    println("Hello, world!")
}

// EXAMPLE 2. Default arguments and named arguments
fun sayHello(name:String){
    println("Hello, $name")
}

// EXAMPLE 3. Return Types
fun greet(name:String = "Human", greeting: String = "Hello") {
    println("$greeting, $name")
}
fun add(a: Int, b: Int): Int {
    return a + b
}
// EXAMPLE 4. Single-expression functions
fun multiply(a:Int,b: Int):Int = a * b

fun main() {
    sayHello()
    sayHello("Vero")
    greet()
    greet("Vero", "Hola")
    greet(greeting = "Hola")
    val result = add(1,300)
    println(result)

    val result2 = multiply(4,5)
    println(result2)
}





