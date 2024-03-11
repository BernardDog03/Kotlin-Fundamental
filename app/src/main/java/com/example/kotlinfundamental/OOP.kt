package com.example.kotlinfundamental

/*
    4 Object-Oriented Programming (OOP) concepts in Kotlin
    - Inheritance = Allow user to create a new class (derived class) form an existing class (base class)
    - Encapsulation = Hiding critical information from other classes and exposing it through a select method
    - Abstraction = Class that cannot be instantiated and is meant tob be subclassed
    - Polymorphism = ability of a function or method to take on multiple forms depending on the context in which it is called
*/

fun main(){

    //Class()
    val animal = Animal()
    val bioFighter1 = """
        Name: ${animal.name}
        Species: ${animal.species}
        Gender: ${animal.gender}
        age: ${animal.age}
        isMamal: ${animal.isMamal}
    """.trimIndent()
    print(bioFighter1)
    println("\n")

    animal.name = "Jujubee"
    animal.species = "Domestic Short Hair"
    animal.gender = "Female"
    animal.age = 2
    animal.isMamal = true

    val bioFighter2 = """
        Name: ${animal.name}
        Species: ${animal.species}
        Gender: ${animal.gender}
        age: ${animal.age}
        isMamal: ${animal.isMamal}
    """.trimIndent()
    print(bioFighter2)
}

//Object
fun objectExample(){
    val name = "Bernard"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.reversed())

    val string = "12345"
    println(string)

    val stringToInt = string.toInt()
    println(stringToInt is Int)
}

//Class
class Animal(){
    var name: String = "Dave the magical cheese wizard"
    var species: String = "Domestic Short Hair Mix Cat"
    var gender: String = "Male"
    var age: Int = 1
    var isMamal: Boolean = true

    fun basicAttack(){
        println("$name using his basic attack!")
    }

    fun rechargePower(){
        println("$name recharge his power!")
    }
}