// Public and final by default
class NotABaseClass{
    fun test():Int{
        return 1
    }
}
//class MyClass : NotABaseClass(){

open class BaseClass{
    open fun doSomething(){
        println("BaseClass doSomething")
    }
}

class Derived : BaseClass(){
    override fun doSomething(){
        println("Derived doSomething")
        //super.doSomething()
    }
    fun anotherMethod(){
        println("Hello")
    }
}

// EXAMPLE 1. Final by default

// WRONG
// class WrongClass : NotABaseClass()

// EXAMPLE 2. Open class

fun main() {
    val derived = Derived()
    derived.doSomething()
}