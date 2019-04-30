package com.jk

import com.jk.kotlin.parking.Car
import java.time.LocalDateTime

fun main() {
    val parkingLot = HashMap<String, Car?>()

    var enterTime = LocalDateTime.of(2019, 4, 30, 8, 0, 0)
    var car:Car? = Car("AAA-0001", enterTime)
    parkingLot.put(car!!.id, car)
    car = Car("BBB-0002", enterTime.plusMinutes(15))
    parkingLot.put(car.id, car)
    // Car 1 leaving
    var leaveTime = LocalDateTime.of(2019, 4, 30, 9, 0, 0)
    car = parkingLot.get("AAA-0001")
    car?.leave = leaveTime
    println("${car?.id}, duration: ${car?.duration()} ")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    // Car 2 leaving
    car = parkingLot.get("BBB-0002")
    car?.leave = leaveTime.plusHours(2)
    println("${car?.id}, duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

/*   val list = listOf(5, 1, 2, 4)
    println(list)
    val scores = listOf(65, 44, 12, 85, 98)
    for (score in scores){
        println(score)
    }
    // listOf(elements ...) : immutable list, only have read function
    println(list.get(0))
    // mutableList :
    var mutableList = mutableListOf(5, 1, 3, 5, 6)
    mutableList.add(89)
    println(mutableList)

    // Note: kotlin considered performance in change of mutable collection, so made the difference
    // between immutable and mutable*/
}