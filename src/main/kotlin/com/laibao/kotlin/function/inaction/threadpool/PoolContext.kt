package com.laibao.kotlin.function.inaction.threadpool

import kotlinx.coroutines.ExecutorCoroutineDispatcher
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

/**
 * @author laibao wang
 */

val poolContext: ExecutorCoroutineDispatcher = Executors.newFixedThreadPool(5).asCoroutineDispatcher()