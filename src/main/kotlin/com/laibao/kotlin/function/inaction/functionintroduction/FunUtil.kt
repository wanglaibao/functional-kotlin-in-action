package com.laibao.kotlin.function.inaction.functionintroduction

/**
 * @author laibao wang
 */

fun <T> transform(t:T, fn:(T) -> T): T = fn(t)


val capitalizeValue = object:Function1<String, String> {
    override fun invoke(p1: String): String {
        return p1.capitalize()
    }
}

fun transform(str:String, fn:(String) -> String): String = fn(str)

fun reverse(str: String): String = str.reversed()


fun unless(condition: Boolean, block: () -> Unit){
    if (!condition) block()
}

fun <T> useMachine(t: T, machine: Machine<T>) {
    machine.process(t)
}
//功能和 Machine接口一致
typealias MachineAlias<T> = (T) -> Unit

fun <T> useMachineAlias(t: T, machine: MachineAlias<T>) {
    machine(t)
}

tailrec fun factorial(n:Long):Long = if (n <= 1) 1 else n * factorial(n -1)

fun factorial1(n: Long): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun functionalFactorial(n: Long): Long {
    fun go(n: Long, acc: Long): Long = if (n <= 0) acc else n * go(n - 1, acc)
    return go(n, 1)
}

fun tailrecFactorial(n: Long): Long {
    tailrec fun go(n: Long, acc: Long): Long = if (n <= 0) acc else n * go(n - 1, acc)
    return go(n, 1)
}


fun fib(n: Long): Long {
    return when (n) {
        0L -> 0
        1L -> 1
        else -> {
            var a = 0L
            var b = 1L
            var c = 0L
            for (i in 2..n) {
                c = a + b
                a = b
                b = c
            }
            c
        }
    }
}

fun functionalFib(n: Long): Long {
    fun go(n: Long, prev: Long, cur: Long): Long {
        return if (n == 0L) {
            prev
        } else {
            go(n - 1, cur, prev + cur)
        }
    }
    return go(n, 0, 1)
}

fun tailrecFib(n: Long): Long {
    tailrec fun go(n: Long, prev: Long, cur: Long): Long {
        return if (n == 0L) {
            prev
        } else {
            go(n - 1, cur, prev + cur)
        }
    }
    return go(n, 0, 1)
}