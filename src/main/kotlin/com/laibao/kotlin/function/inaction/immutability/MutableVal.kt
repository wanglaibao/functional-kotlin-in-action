package com.laibao.kotlin.function.inaction.immutability

/**
 * @author laibao wang
 */
object MutableVal {
    var count = 0

    val myString:String = "Mutable"
        get() {
            return "$field ${++count}"
        }
}

fun main(args: Array<String>) {
    println("Calling 1st time ${MutableVal.myString}")
    println()
    println("Calling 2nd time ${MutableVal.myString}")
    println()
    println("Calling 3rd time ${MutableVal.myString}")
}