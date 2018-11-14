package com.laibao.kotlin.function.inaction.immutability

/**
 * @author laibao wang
 */
class MutableObj {
    var value = ""

    override fun toString(): String {
        return "MutableObj(value='$value')"
    }
}

fun main(args: Array<String>) {
    val mutableObj:MutableObj = MutableObj()//(1)
    println("MutableObj $mutableObj")

    mutableObj.value = "Changed"//(2)
    println("MutableObj $mutableObj")

    val list = mutableListOf("a","b","c","d","e")//(3)
    println(list)

    list.add("f")//(4)
    println(list)

    val immutableList = listOf(1,2,3,4,5,6,7)//(1)
    println("Immutable List $immutableList")
    val mutableList:MutableList<Int> = immutableList.toMutableList()//(2)
    println("Mutable List $mutableList")
    mutableList.add(8)//(3)
    println("Mutable List after add $mutableList")
    println("Mutable List after add $immutableList")
}