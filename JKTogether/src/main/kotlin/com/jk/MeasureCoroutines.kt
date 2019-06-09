package com.jk

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
//    measureTime4CreateThread()
    measureTime4CreateCoroutines()
}

private fun measureTime4CreateCoroutines() {
    var counter = 1
    var ms = measureTimeMillis {
        GlobalScope.launch {
            for (i in 1..1_000_000) {
                counter++
            }
        }
    }
    println("spend time(ms) for create 100,000 coroutines : $ms")
}

private fun measureTime4CreateThread() {
    var counter = 1
    var ms = measureTimeMillis {
        for (n in 1..100_000) {
            thread {
                counter++
            }
        }
    }
    println("spend time(ms) for create 100,000 thread : $ms")
}