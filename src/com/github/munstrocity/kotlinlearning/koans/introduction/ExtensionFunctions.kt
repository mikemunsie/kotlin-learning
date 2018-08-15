package com.github.munstrocity.kotlinlearning.koans.introduction

/*

Read about extension functions. Then implement extension functions Int.r() and Pair.r() and make them
convert Int and Pair to RationalNumber.

 */

// You can reference the int value by using this
fun Int.r(): RationalNumber = RationalNumber(this, 1)

// You can get the first and second values from a pair by using (first, second)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)