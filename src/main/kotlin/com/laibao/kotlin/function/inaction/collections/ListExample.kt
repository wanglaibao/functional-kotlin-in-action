package com.laibao.kotlin.function.inaction.collections

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val intList = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (element in intList) {
        println("Item $element")
    }
    println()

    intList.forEach(::println)
    println()

    intList.forEach {element -> println(element)}


    val emptyList1 = listOf<Any>()
    println("emptyList1.size = ${emptyList1.size}")

    val emptyList2 = emptyList<Any>()
    println("emptyList2.size = ${emptyList2.size}")
}
