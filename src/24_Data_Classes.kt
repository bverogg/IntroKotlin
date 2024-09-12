
// data class los valores de las propiedades importan,
// ahora si son idénticas
data class Car(val brand: String, val model: String, val year: Int)

fun main(){
    // EXAMPLE 1
    val car1 = Car("Toyota", "Corolla", 2020)
    val car2 = Car("Toyota", "Corolla", 2020)

    if(car1 == car2){
        println("Car 1 and Car 2 are equal")
    }else{
        println("Car 1 and Car 2 are not equal")
    }
}