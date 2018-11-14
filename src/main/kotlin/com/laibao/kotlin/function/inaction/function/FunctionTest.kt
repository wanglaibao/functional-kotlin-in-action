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
}