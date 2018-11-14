package com.laibao.kotlin.function.inaction.function

/**
 * @author laibao wang
 */

fun performOperationOnEven(number:Int,operation:(Int)->Int):Int = if (number % 2 == 0) operation(number) else number

