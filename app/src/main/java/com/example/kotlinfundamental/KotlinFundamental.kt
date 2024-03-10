package com.example.kotlinfundamental

import android.view.animation.AnimationSet
import kotlin.random.Random

fun main ()
{
    //functionPrint()
    //dataTypeAndVariableExample()
    //ifExpressionExample()
    //booleanExample()
    //numbersExample()
    //arrayExample()
    //nullExample()
    //whenExpressionExample()
    //whileDoWhileExample()
    //rangeExample()
    //forLoopExample()
    //breakContinueExample()

    //setUserFunctionExample("Bernard", 50)
    //val fullNameV1 = fullNameUser("Bernard", "Dog")
    //val fullNameV2 = fullNameUser(lastName = "Dog", firstName = "Bernard")
    //val fullNameV3 = fullNameUser("Bernard")
    //println(fullNameV1)
    //println(fullNameV2)
    //println(fullNameV3)

    //val number = sumNumbers(10, 20, 30, 40, 50)
    //println(number)

    //val number = getNumberSize(10, 20, 30, 40, 50)
    //println(number)
}

//Print
fun  functionPrint() {
    // Hello World!
    // \n = For New Line
    println("Hello World!")

    // Single Line Comment
    /*
        Multi Line Comment
        Multi Line Comment
        Multi Line Comment
    */

    //Print Function
    val name = "Bernard"

    print("Hello My Name is ")
}

//Var And Val
fun dataTypeAndVariableExample() {
    // Var = For a variable whose value can change
    // Val = For a variable whose value never changes

    //Char
    var firstWord = 'A'

    println(firstWord)
    println(firstWord++)
    println(firstWord++)
    println(firstWord--)
    println(firstWord--)
    println(firstWord-- + "\n")

    //String
    val text = "Bernard"
    val firstChar = text[1]

    println("The 2nd character of the $text word is $firstChar")
    for (char in text)
    {
        print("$char ")
    }

    //Escaped String
    /*
        \t = Adding a tab  within the text
        \n = Creating a new line within the text
        \' = Adding a single quote character within the text
        \" = Adding a double quote character within the text
        \\ = Adding a backslash character within the text
    */

    val escapedStringExample = "Kotlin is \"Awesome!\""
    println("\n" + escapedStringExample)

    //Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
    """.trimMargin()
    print(line)

    val name = "Bernard"
    val old  = 3
    println("\nMy name is $name, im $old years old")

    val hour = 7
    println("Restaurant ${if (hour > 7 ) "already close" else "is open"}")
}

//If Expression
fun ifExpressionExample() {
    val openHours = 7
    val now = 10
    val restaurant : String

    restaurant = if (now > openHours) {
        "Restaurant already open"
    }
    else if (now == openHours) {
        "Wait a minute, restaurant will be open"
    }
    else {
        "Restaurant is closed"
    }
    println(restaurant)
}

//Boolean
fun booleanExample() {
    val restaurantOpen = 16
    val restaurantClosed = 22
    val now = 20

    /*
        Conjunction or AND (&&)
        - false && false => false
        - false && true => false
        - true && false => false
        - true && true => true
    */
    val isOpen = now >= restaurantOpen && now <= restaurantClosed
    println("Restaurant is open: $isOpen")

    /*
        Disjunction or OR (||)
        - false || false => false
        - false || true => true
        - true || false => true
        - true || true => true
    */
    val isClosed = now < restaurantOpen || now > restaurantClosed
    println("Restaurant is close: $isClosed")

    /*
        Negation or NOT (!)
        - true = false
        - false = true
    */
    if (!isOpen) {
        println("Restaurant is closed")
    } else {
        println("Restaurant is open")
    }
}

//Numbers
fun numbersExample() {
    //int = 32 bit (range -2'63 .... +2'31-1)
    val intNumber = 100

    //Long = 64 bit (range -2'63 .... +2'63-1)
    val longNumber : Long = 100 //or val longNumber = 100L

    //Short = 16 bit
    val shortNumber : Short = 10

    //Byte = 8 bit
    val byteNumber = 0b11010010

    //Double = 64 bit (15 - 16 decimal digit)
    val doubleNumber: Double = 2.8

    //Float = 32 bit (6 - 7 decimal digit)
    val floatNumber: Float = 0.1234567f

    println(intNumber)
    println(longNumber)
    println(shortNumber)
    println(byteNumber)
    println(doubleNumber)
    println(floatNumber)

    val minInt = Int.MIN_VALUE
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1
    println("Min value Int: $minInt")
    println("Max value Int: $maxInt")
    println("Over range Int: $overRangeInt")

    val numberOne = 25
    val numberTwo = 10
    println(numberOne + numberTwo)
    println(numberOne / numberTwo)
    println(numberOne * numberTwo)
    println(numberOne - numberTwo)

    println(5 + 4 * 4)
    println((5 + 4) * 4)

    /*
        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
    */
    val stringNumber = "6"
    val number = 4

    println(number + stringNumber.toInt())
}

//Array
fun arrayExample() {
    /*
        intArrayOf(): Int Array
        booleanArrayOf(): Boolean Array
        charArrayOf(): Char Array
        longArrayOf(): Long Array
        shortArrayOf(): Short Array
        byteArrayOf(): Byte Array
    */
    val array = arrayOf("Alpha", "Beta", "Hotel", "Delta", "Echo")
    println(array[2])
    array[2] = "Charlie"
    println(array[2])

    val mixArray = arrayOf("One", 3, "lima", 7, false)
    println(mixArray[0])
    mixArray[0] = 1
    println(mixArray[0])

    val intArray = intArrayOf(1, 2, 3, 10, 5)
    println(intArray[3])
    intArray[3] = 4
    println(intArray[3])

}

//Null
fun nullExample() {
    //val text: String = null
    val text : String? = null

    val string: String? = "Bernard"
    if (string != null){
        println(string)
        println(string.length)
    }

    val obj: Any = "Bernard"
    if (obj is String){
        println("String length is ${obj.length}")
    }

    //Safe Calls Operator (?.) = "Null Safety Checks" return null value
    //text?.length

    //Elvis Operator (condition ? then : else) = if null, return default value
    //val textLength = text?.length ?: 7
    //or
    //val textLength = if (text != null) text.length else 7

    //Non-null Assertion (!!) = avoiding unnecessary null and undefined
    //val textLength = text!!.length
}

//When Expression
fun whenExpressionExample(){
    val value = 2
    val check = when (value){
        1 -> {
            println("value is 1")
            "One"
        }
        2 -> {
            println("value is 2")
            "Two"
        }
        3 -> {
            println("value is 3")
            "Three"
        }
        else -> "value not found!"
    }
    println(check)

    val anyType: Any = "Bernard"
    when (anyType){
        is Long -> println("The value has a Long type")
        is String -> println("The value has a String type")
        is Int -> println("The value has a Int type")
        else -> println("undefined")
    }

    val valueRange = 5
    val range = 1..10
    when(valueRange){
        in range -> println("value is in the range")
        !in range -> println("undefined")
    }

    val registerNumber = when( val random = getRandomNumber()){
        in 1..50 -> 50 * random
        in 51..100 -> 100 * random
        else -> random
    }
}

//While and Do While
fun whileDoWhileExample(){
    var counter = 1
    while (counter <= 5){
        println("Hello, World!")
        counter++
    }

    var counterDoWhile = 1
    do {
        println("Hi, World!")
        counterDoWhile ++
    } while (counterDoWhile <= 5)
}

//Range
fun rangeExample(){
    val range = 1..10
    println(range.step)

    val rangeStep = 1..10 step 2
    rangeStep.forEach{
        println("$it")
    }
    println(rangeStep.step)

    val value = 4
    val tenToOne = 10 downTo 1
    if (value in tenToOne){
        println("value $value available")
    } else {
        println("undefined")
    }
}

//For Loop
fun forLoopExample(){
    val ranges = 1..10
    for (i in ranges){
        println("value is $i!")
    }

    val rangesWithStep = 1..10 step 2
    for (i in rangesWithStep){
        println("value is $i, with step ${rangesWithStep.step}")
    }
    for ((index, value) in rangesWithStep.withIndex()){
        println("value is $value, with index $index")
    }

    rangesWithStep.forEach{
        println("value is $it!")
    }
}

//Break and Continue
fun breakContinueExample(){
    val list = listOf(1, 2, null, 4, null)

    for (i in list) {
        if (i == null) continue
        println(i)
    }
    for (i in list) {
        if (i ==  null) break
        println(i)
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")
        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}


fun getRandomNumber() = Random.nextInt(100)

//Function
/*
    fun sum(param1: Type1, param2: Type2, ....): ReturnType {
        return result
    }
*/
fun setUserFunctionExample(name: String, age: Int){
    println("Your name is $name, and you $age years old")
}
fun fullNameUser(firstName :String = "firstName", lastName: String = "lastName"): String {
    return "My name: $firstName $lastName"
}

//Variable Argument
// To declare a parameter that can accept multiple argument of the same type
fun sumNumbers(vararg number: Int):Int {
    return number.sum()
}
fun getNumberSize(vararg number: Int): Int {
    return number.size
}