package com.github.munstrocity.kotlinlearning.koans.conventions

class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// You can make MyDate destructurable by adding in the data class
data class MyDataDataClass(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDataDataClass): Boolean {
    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}