package com.laibao.kotlin.function.inaction.function

import java.util.regex.Pattern

/**
 * @author laibao wang
 */

fun String.countWordNumber():Int = this.trim().split(Pattern.compile("\\s+")).size

fun Int.isGreaterThan(anotherNumber:Int = 0):Boolean = this > anotherNumber


