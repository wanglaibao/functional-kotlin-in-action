package com.laibao.kotlin.function.inaction.functionintroduction

/**
 * @author laibao wang
 */
class FunctionalTest {

}

val capitalize = { str: String -> str.capitalize() }

fun main(args: Array<String>) {
    println(capitalize("hello world!"))
}