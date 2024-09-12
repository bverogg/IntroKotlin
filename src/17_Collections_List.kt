

fun main(){

    // EXAMPLE 1. Immutable List
    // listas que no se modifican ni se agregan elementos
    // los elementos se pueden repetir
    var list = listOf(1,2,2,3,4,5)
    for(i in list){
        println(i)
    }

    // EXAMPLE 2. Mutable List
    var list2 = mutableListOf(1,2,3,4,5)
    list2.add(3)
    list2.add(5)

    println(list2)
    for(i in list2){
        println(i)
    }



    // EXAMPLE 3. Common operations
    // get, size, contains, filter
    println(list2.get(1))
    println(list2[2])
    println(list2.size)
    var result = list2.filter { it > 2 }
    var resul2 = list2.contains(5)

    println(result)
    println(resul2)

}