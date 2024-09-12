
// Class Definition
class Person {
    var name: String = ""
}

// Constructor
class Human(var name:String, var lastName:String) {

}

fun main() {

    // EXAMPLE 1. Instance of a person

    // EXAMPLE 2. Instance of a person

    //ERROR
    // student = Person()

    //EXAMPLE 3

    var person = Person()
    //val person = Person()
    person.name="Vero"
    println(person.name)

    //val human = Human()
    //val human = Human("Gallardo")
    val human = Human(lastName = "Gallardo", name = "Vero")

    println(human.name)
    println(human.lastName)

}