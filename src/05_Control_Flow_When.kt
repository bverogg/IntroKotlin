import java.util.*

fun main() {

    val value = 10

    // EXAMPLE 1. There is not switch in Kotlin
    when (value) {
        15 -> println("Number is 15")
        12 -> println("Number is 12")
        10 -> println("Number is 10")
        else -> println("??")
    }

    // EXAMPLE 2. "when" can be used as expression
    val dayOfWeek = 2
    val dayName = when(dayOfWeek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Unknown"
    }
    println(dayName)
    // EXAMPLE 3. "when" is more flexible than switch
    val x = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        0,3 -> println("x is 0 or 3")
        in 1 ..10 -> println("x is in 1 .. 10")
        //!in 10..20 -> println("x is outside the range")
        in 10..20 -> println("x is in 10 .. 20")
        else -> println("Other value")
    }

}