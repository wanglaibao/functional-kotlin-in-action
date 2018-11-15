package com.laibao.kotlin.function.inaction.collections

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val set = mutableSetOf(1,2,3,3,2)
    println("set $set")
    set.add(4)
    set.add(5)
    set.add(5)
    set.add(6)
    println("set $set")
    println()
    for (element in set) {
        println(element)
    }
    println()
    set.forEach(::println)
}
