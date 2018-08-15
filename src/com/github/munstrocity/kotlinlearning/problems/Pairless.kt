/*
 * Think of a perfect world where everybody has a soulmate.
 * Now, the real world is imperfect: there is exactly one number in the array
 * that does not have a pair. A pair is an element with the same value.
 * For example in this array:
 *   1, 2, 1, 2
 * every number has a pair, but in this one:
 *   1, 1, 0, 1, 1
 * one of the ones is lonely.
 *
 * Your task is to implement the findPairless() function so that it finds the
 * lonely number and returns it.
 *
 * A hint: there's a solution that looks at each element only once and uses no
 * data structures like collections or trees.
 */
package com.github.munstrocity.kotlinlearning.problems

fun findPairless(a: IntArray): Int {

    // And I'm using fold again. This is the best.
    return a.fold(-1) { lonelyNumber, i ->
        if ((a.filter { it == i }).size % 2 != 0) return i
        lonelyNumber
    }
}
