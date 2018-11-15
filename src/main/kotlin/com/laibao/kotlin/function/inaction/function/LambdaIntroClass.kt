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

    val customer1 = Customer("John", "Carl", "Doe", "XX234", 82.3, 180)

    val customer2 = Customer(
            lastName = "Doe",
            firstName = "John",
            middleName = "Carl",
            height = 180,
            weight = 82.3,
            passportNumber = "XX234")

    val programmer1 = Programmer("John", "Doe")

    //val programmer2 = Programmer("John", "Doe", 12) //Error

    val programmer2 = Programmer("John", "Doe", yearsOfExperience = 12) //OK

    val programmer3 = Programmer("John", "Doe", "TypeScript", 1)
}