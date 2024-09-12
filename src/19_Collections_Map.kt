fun main() {
    // clave valor
    // EXAMPLE 1. Immutable
    val ageMap = mapOf("Alice" to 30, "Bob" to 25)
    println(ageMap)

    // EXAMPLE 2. Mutable
    val ageMap2 = mutableMapOf("Alice" to 30, "Bob" to 50)
    ageMap2["Alice"] = 50
    ageMap2["Charlie"] = 39
    ageMap2.put("Alice", 40)
    ageMap2.remove("Bob")

    println(ageMap2)

}