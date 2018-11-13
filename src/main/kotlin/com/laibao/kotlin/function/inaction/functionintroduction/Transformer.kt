package com.laibao.kotlin.function.inaction.functionintroduction

/**
 * @author laibao wang
 */
class Transformer {
    fun upperCased(str: String): String = str.toUpperCase()

    companion object {
        fun lowerCased(str: String): String = str.toLowerCase()
    }
}