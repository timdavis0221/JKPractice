package com.jk

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    Thread({
        for (i in 1..10) {
            println("Thread in Kotlin : $i")
        }
    }).start()

    thread {
        for (i in 1..10) {
            println("thread() : i = $i")
            Thread.sleep(50)
        }
    }

    GlobalScope.launch {
        for (i in 1..10) {
            println("Coroutines: $i")
            delay(50L)
        }
    }
}