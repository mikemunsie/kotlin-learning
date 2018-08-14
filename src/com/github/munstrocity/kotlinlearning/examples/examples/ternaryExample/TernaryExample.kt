package com.github.munstrocity.kotlinlearning.examples.examples.ternaryExample

import com.github.munstrocity.kotlinlearning.examples.examples.Example
import com.github.munstrocity.kotlinlearning.examples.examples.ExampleValue

// No ternaryExample operators needed
private fun max(a: Int, b: Int) = if (a > b) a else b

class TernaryExample : Example {
    override val name = "Ternary"

    override fun getValues(): List<ExampleValue> {
        return listOf(
                ExampleValue("max(10,20)", max(10, 20).toString())
        )
    }
}