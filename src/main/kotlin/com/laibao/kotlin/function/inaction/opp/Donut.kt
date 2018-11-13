package com.laibao.kotlin.function.inaction.opp

/**
 * @author laibao wang
 */
class Donut (flavour: String, val topping: String) : BakeryGood(flavour){
    override fun name(): String = "donut with $topping topping"
}