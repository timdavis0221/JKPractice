package com.jk.kotlin.parking

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enterTime: LocalDateTime = LocalDateTime.of(2019, 4, 23, 22, 0, 0)
    val leaveTime: LocalDateTime = LocalDateTime.of(2019, 4, 24, 0, 8, 0)

    var car = Car("aa-0257", enterTime)
    car.leave = leaveTime // call setter
    println(car.duration())

    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id: String, val enterTime: LocalDateTime){
    // set property leave later so define it here
    var leave: LocalDateTime? = null
        // custom setter
        set(value) {
            if (enterTime.isBefore(value))
                field = value
        }
    fun duration() = Duration.between(enterTime, leave).toMinutes()
}