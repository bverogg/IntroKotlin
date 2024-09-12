// A lambda is an anonymous function, meaning a function that does not have an associated name.
// { parameters -> body }
// funciones que no tienen nombre para poder
// trabajar con funciones de orden superior

// EXAMPLE 1. Lambda definition
val add = { a: Int, b: Int -> a + b }

// EXAMPLE 2. One string

fun main() {
    val result = add(1, 2)
    println(result)
}