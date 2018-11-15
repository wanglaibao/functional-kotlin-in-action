package com.laibao.kotlin.function.inaction.function

/**
 * @author laibao wang
 */

fun performOperationOnEven(number:Int,operation:(Int)->Int):Int = if (number % 2 == 0) operation(number) else number

fun getAnotherFunction(n:Int):(String)->Unit = {println("n:$n it:$it")}

fun addNumbers(a:Int = 0,b:Int = 0):Int =  a+b

fun aVarargFun(vararg names: String) = names.forEach(::println)

fun <T, R> transform(vararg ts: T, f: (T) -> R): List<R> = ts.map(f)


