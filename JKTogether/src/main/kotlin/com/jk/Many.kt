package com.jk

fun main() {
    val list = listOf(5, 1, 2, 4)
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
    // between immutable and mutable
}