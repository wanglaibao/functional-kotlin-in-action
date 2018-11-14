package com.laibao.kotlin.function.inaction.functionintroduction


/**
 * @author laibao wang
 */
class FunctionalTest {

}

val capitalize = { str: String -> str.capitalize() }

fun main(args: Array<String>) {
    println(capitalize("hello world!"))
    println()
    println(capitalizeValue("asdfasfdasfdasfdasdfasfd"))
    println(transform("scala", capitalize))
    println(transform("scala", ::reverse))

    println(transform("kotlin", MyUtils::doNothing))

    val transformer:Transformer = Transformer()
    println(transform("kotlin", transformer::upperCased))
    println(transform("kotlin", Transformer.Companion::lowerCased))

    println(transform("groovy", { str -> str.substring(0).toUpperCase() }))

    println(transform("kotlin") { str -> str.substring(0).toUpperCase() })

    val securityCheck = false
    unless(securityCheck) { println("You can't access this website")}  //柯里化

    useMachine(5, PrintMachine())

    //利用匿名类
    useMachine(5, object :Machine<Int>{
        override fun process(t: Int) {
            println(t)
        }
    })


    useMachineAlias(5, PrintMachineAlias())
    useMachineAlias(5, ::println)
    useMachineAlias(5) { it -> println(it) }


    println("阶乘的结果为: "+ factorial(5))

}


