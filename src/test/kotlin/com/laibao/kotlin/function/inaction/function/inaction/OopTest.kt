package com.laibao.kotlin.function.inaction.function.inaction

import com.laibao.kotlin.function.inaction.opp.*
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

    @Test
    fun testAlmondCupcake() {
        val cupCake = AlmondCupcake()
        println("My second cupcake has ${cupCake.flavour} flavour")
    }

    @Test
    fun testCupcake() {
        val myBlueberryCupcake = Cupcake("Blueberry")
        val myAlmondCupcake = Cupcake("Almond")
        val myCheeseCupcake = Cupcake("Cheese")
        val myCaramelCupcake = Cupcake("Caramel")

        println(myBlueberryCupcake.eat())
        println(myAlmondCupcake.eat())
        println(myCheeseCupcake.eat())
        println(myCaramelCupcake.eat())

        val myBlueberryCupcake1: BakeryGood = Cupcake("Blueberry")
        val myAlmondCupcake1:BakeryGood = Cupcake("Almond")
        val myCheeseCupcake1:BakeryGood = Cupcake("Cheese")
        val myCaramelCupcake1:BakeryGood = Cupcake("Caramel")

        println(myBlueberryCupcake1.eat())
        println(myAlmondCupcake1.eat())
        println(myCheeseCupcake1.eat())
        println(myCaramelCupcake1.eat())
    }
}