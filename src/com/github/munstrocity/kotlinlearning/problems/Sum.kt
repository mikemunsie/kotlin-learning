package com.github.munstrocity.kotlinlearning.problems

/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
fun sum(a: IntArray): Int {
    if (a.isEmpty()) return 0

    // Fun fact: reduce does not take an initial value like it does in javascript
    // Also, return statements will actually stop the reduce and return the value (mind blown)
    return a.reduce { sum, i -> sum + i }
}