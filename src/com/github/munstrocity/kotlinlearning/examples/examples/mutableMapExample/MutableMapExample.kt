package com.github.munstrocity.kotlinlearning.examples.examples.mutableMapExample

import com.github.munstrocity.kotlinlearning.examples.examples.Example
import com.github.munstrocity.kotlinlearning.examples.examples.ExampleValue

class MutableMapExample : Example {
    override val name = "Mutable Map"

    override fun getValues(): List<ExampleValue> {
        // How to add data into a mutableMapExample
        val map = mapOf(
                "one" to 1,
                "two" to 2
        )
        val mapValues = map
                .map { (key, value) -> "$key = $value" }
                .joinToString("\n")

        return listOf(
                ExampleValue("value of map", "\n$mapValues")
        )
    }
}