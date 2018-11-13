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
}


