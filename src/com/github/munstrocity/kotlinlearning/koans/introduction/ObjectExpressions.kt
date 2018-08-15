package com.github.munstrocity.kotlinlearning.koans.introduction

import java.util.*

// Java Style
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}

// Kotlin Style
fun getList2(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { x, y -> y - x })
    return arrayList
}

fun getList3(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}