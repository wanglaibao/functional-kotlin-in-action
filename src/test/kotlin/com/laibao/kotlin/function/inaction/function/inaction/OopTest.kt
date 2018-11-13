package com.laibao.kotlin.function.inaction.function.inaction

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
}