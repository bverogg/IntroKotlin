// se utiliza para que otras clases la hereden
// y tengan la funcionalidad
// comportamiento definido y acciones
abstract class MyAbstractClass {
    var firstName = ""
    var lastName = ""
    var address = ""

    open fun getFullName() = "$firstName $lastName"
    abstract fun getMyAddress(): String
}

class MyClass : MyAbstractClass(){
    override fun getMyAddress(): String {
        return "Address $address"
    }
    override fun getFullName(): String = "First Name $firstName, Last Name $lastName ${super.getFullName()}"
}

fun main() {
    val myInstance =  MyClass()
    myInstance.firstName = "Vero"
    myInstance.lastName = "Gallardo"
    myInstance.address = "Anything"
    val result = myInstance.getMyAddress()
    println(result)
    println(myInstance.getFullName())
}