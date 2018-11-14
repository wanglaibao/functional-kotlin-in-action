package com.laibao.kotlin.function.inaction.functionintroduction

/**
 * @author laibao wang
 */
class PrintMachine<T> : Machine<T> {
    override fun process(product: T) {
        println(product)
    }
}