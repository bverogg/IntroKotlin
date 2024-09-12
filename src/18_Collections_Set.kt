

fun main(){

    //  A group of unique elements

    // EXAMPLE 1. Immutable Set
    var companies = setOf("Microsoft", "Apple", "Intel")
    println(companies)
    // a pesar de colocar 2 veces Microsoft, lo quita
    // no se pueden agregar elementos, ni quitarse

    // EXAMPLE 2. Mutable Set
    var fruits = mutableSetOf("Apple","Banana")
    fruits.add("Orange")
    fruits.remove("Apple")
    println(fruits)

}