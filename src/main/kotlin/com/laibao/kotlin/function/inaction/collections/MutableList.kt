package com.laibao.kotlin.function.inaction.collections

/**
 * @author laibao wang
 */

fun main(args: Array<String>) {
    val list = mutableListOf(1,2,4)     //(1)
    for (i in list) {
        println("for1 item $i")
    }

    println("-----Adding Items-----")

    list.add(5)                         //(2)
     list.add(3)                        //(3)
     list.add(6)                        //(4)
    for (i in list) {
        println("for2 item $i")
    }
    println()

    val list1 = listOf(
            "1st Item",
            "2nd Item",
            "3rd Item",
            "4th Item",
            "5th Item"
    )

    println("3rd Item on the list - ${list1.get(2)}")
    println("4rd Item on the list - ${list1[3]}")
}
