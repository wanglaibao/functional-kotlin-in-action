package com.laibao.kotlin.function.inaction.function

/**
 * @author laibao wang
 */
class LambdaIntroClass {
    val sum = { x: Int, y: Int -> x + y }

    fun invokeSomeStuff(someInterface: SomeInterface) {
        someInterface.doSomeStuff()
    }

    fun invokeSomeStuffAction(doAction:()->Unit) {
        doAction()
    }
}

interface SomeInterface {
    fun doSomeStuff()
}

fun main(args: Array<String>) {
    val lambdaIntroClass = LambdaIntroClass()
    lambdaIntroClass.invokeSomeStuff(object :SomeInterface{
        override fun doSomeStuff() {
            println("asfdasfdasfd")
        }
    })

    lambdaIntroClass.invokeSomeStuffAction({println("doSomeStuff called")})
    println()
    lambdaIntroClass.invokeSomeStuffAction { println("asdfasfasf")}
    println()

    println(lambdaIntroClass.sum(100,100))
}