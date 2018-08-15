/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
package com.github.munstrocity.kotlinlearning.problems

fun maxIndex(a: IntArray): Int? {
    if (a.isEmpty()) return null

    // foldIndex is like fold, but with an index (sweet)
    // If you want to return early with a value, use the return @functionCall val
    return a.foldIndexed(Pair(0,a[0])) { index, acc, i ->
        val (_, value) = acc
        if (i >= value) return@foldIndexed Pair(index, i)
        acc
    }.first
}
