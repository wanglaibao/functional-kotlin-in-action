package com.laibao.kotlin.function.inaction.immutability

import com.laibao.kotlin.function.inaction.threadpool.poolContext
import kotlinx.coroutines.async

/**
 * @author laibao wang
 */
class MyData {
    var someData:Int = 0
}

fun main(args: Array<String>) {
    val myData:MyData = MyData()

//    async(poolContext) {
//        for(i in 11..20) {
//            myData.someData+=i
//            println("someData from 1st async ${myData.someData}")
//        }
//    }


}