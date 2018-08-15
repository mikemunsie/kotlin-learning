package com.github.munstrocity.kotlinlearning.koans.conventions

/*

Objects with invoke() method can be invoked as a function.

You can add invoke extension for any class, but it's better not to overuse it:

 */

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

// As you can see, invokable() calls the invoke function which returns itself
fun invokeTwice(invokable: Invokable) = invokable()()