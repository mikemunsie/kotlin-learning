/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */
package com.github.munstrocity.kotlinlearning.problems

fun runs(a: IntArray): Int {
    if (a.isEmpty()) return 0

    // I'm really diggin' this fold function. You can see I'm returning early once again. So nice.
    return a.fold(Pair(-1,0)) { runInfo, i ->
        val (totalRuns, lastRunValue) = runInfo
        if (totalRuns == -1) return@fold Pair(1,i)
        if (i != lastRunValue) return@fold Pair(totalRuns + 1, i)
        runInfo
    }.first
}