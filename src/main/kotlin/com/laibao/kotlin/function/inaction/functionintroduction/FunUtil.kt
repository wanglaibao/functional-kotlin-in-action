package com.laibao.kotlin.function.inaction.functionintroduction

/**
 * @author laibao wang
 */

fun <T> transform(t:T, fn:(T) -> T): T = fn(t)


val capitalizeValue = object:Function1<String, String> {
    override fun invoke(p1: String): String {
        return p1.capitalize()
    }
}

fun transform(str:String, fn:(String) -> String): String = fn(str)

fun reverse(str: String): String = str.reversed()
