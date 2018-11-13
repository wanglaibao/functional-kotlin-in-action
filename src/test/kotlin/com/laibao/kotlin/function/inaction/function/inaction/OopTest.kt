package com.laibao.kotlin.function.inaction.function.inaction

import com.laibao.kotlin.function.inaction.opp.BlueberryCupcake
import com.laibao.kotlin.function.inaction.opp.VeryBasic
import org.junit.Test

/**
 * @author laibao wang
 */
class OopTest {

    @Test
    fun testVeryBasic() {
        val basic = VeryBasic()
        println(basic.javaClass.canonicalName)
    }

    @Test
    fun testBlueberryCupcake() {
        val cupCake = BlueberryCupcake()
        println(cupCake.flavour)
        cupCake.flavour = "asfdasdfasf"
        println(cupCake.flavour)
        println("My cupcake has ${cupCake.flavour}")
    }
}