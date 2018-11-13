package com.laibao.kotlin.function.inaction.opp

/**
 * @author laibao wang
 */
open class BakeryGood (val flavour: String){
    fun eat(): String = "nom, nom, nom... delicious $flavour bakery good"

    open fun name(): String = "bakery good"
}