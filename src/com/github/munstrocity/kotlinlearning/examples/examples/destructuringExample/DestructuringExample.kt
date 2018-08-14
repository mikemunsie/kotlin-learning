package com.github.munstrocity.kotlinlearning.examples.examples.destructuringExample

import com.github.munstrocity.kotlinlearning.examples.examples.Example
import com.github.munstrocity.kotlinlearning.examples.examples.ExampleValue

private data class Result(val result: Int, val status: String)

private fun ex1(): Result {
    val result = 1
    val status = "Good Status"
    return Result(result, status)
}

private class Ex2<K, V>(private val first: K, private val second: V) {

    // When destructuringExample, this is the first result returned
    operator fun component1(): K {
        return first
    }

    // When destructuringExample, this is the second result returned
    operator fun component2(): V {
        return second
    }
}

class DestructuringExample : Example {
    override val name = "Destructuring"

    override fun getValues(): List<ExampleValue> {
        val (ex1_1, ex1_2) = ex1()
        val (ex2_1, ex2_2) = Ex2(1, 2)
        return listOf(
                ExampleValue("ex1", "$ex1_1, $ex1_2"),
                ExampleValue("ex2", "$ex2_1, $ex2_2")
        )
    }
}