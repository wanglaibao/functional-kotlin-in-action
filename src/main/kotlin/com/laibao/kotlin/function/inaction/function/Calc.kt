package com.laibao.kotlin.function.inaction.function

/**
 * @author laibao wang
 */
class Calc {
    var a:Int=0

    var b:Int=0

    fun addNumbers(a:Int = this.a,b:Int = this.b):Int {
        this.a = a
        this.b = b
        return a+b
    }
}