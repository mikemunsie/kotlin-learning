package com.github.munstrocity.kotlinlearning.examples.callbacksExample

import com.github.munstrocity.kotlinlearning.examples.Example
import com.github.munstrocity.kotlinlearning.examples.ExampleValue

private val numbers = listOf(1, 2, 3)

private fun isOdd(x: Int) = x % 2 != 0

private fun length(s: String) = s.length

private fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

class CallbacksExample : Example {
    override val name = "Callbacks"

    override fun getValues(): List<ExampleValue> {

        // You can pass a function by using ::FunctionName
        val oddNumbers = numbers.filter(::isOdd)

        // Compose function takes two functions can composes them together (f,g) = f(g(*))
        val filteredByOddLength = listOf("a", "ab", "abc").filter(compose(::isOdd, ::length))

        return listOf(
                ExampleValue("composition", filteredByOddLength.toString()),
                ExampleValue("oddNumbers", oddNumbers.toString())
        )
    }
}