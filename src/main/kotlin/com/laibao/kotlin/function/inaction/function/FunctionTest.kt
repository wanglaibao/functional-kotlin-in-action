package com.laibao.kotlin.function.inaction.function

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    println("Called with 4,(it*2): ${performOperationOnEven(4, {it*2})}")
    println()
    println()
    println()
    println("Called with 5,(it*2): ${performOperationOnEven(5, {it*2})}")


    getAnotherFunction(0)("abc")
    getAnotherFunction(2)("def")
    getAnotherFunction(3)("ghi")
    println()

    val calc = Calc()
    println("Result is ${calc.addNumbers(10,15)}")
    println()

    println(addNumbers(10000,20000))
}