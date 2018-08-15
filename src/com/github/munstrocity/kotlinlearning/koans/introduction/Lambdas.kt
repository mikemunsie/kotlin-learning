package com.github.munstrocity.kotlinlearning.koans.introduction

/*

In Kotlin, there is a convention that if the last parameter of a
function accepts a function, a lambda expression that is passed as the corresponding
argument can be placed outside the parentheses:

val product = items.fold(1) { acc, e -> acc * e }

If the lambda is the only argument to that call, the parentheses can be omitted entirely:

run { println("...") }

Anonymous function
ints.filter(fun(item) = item > 0)

*/

val lambdaSum = { x: Int, y: Int -> x + y }

fun lambdaContainsEven(collection: Collection<Int>): Boolean = collection.any {
    it % 2 == 0
}