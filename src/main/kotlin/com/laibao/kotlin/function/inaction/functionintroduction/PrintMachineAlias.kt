package com.laibao.kotlin.function.inaction.functionintroduction

/**
 * @author laibao wang
 */
class PrintMachineAlias<T> : MachineAlias<T>{
    override fun invoke(p: T) {
        println(p)
    }
}