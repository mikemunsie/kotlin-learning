package com.github.munstrocity.kotlinlearning.examples.examples.tryCatchExample

import com.github.munstrocity.kotlinlearning.examples.examples.Example
import com.github.munstrocity.kotlinlearning.examples.examples.ExampleValue

// The ? indicates the value can be nullable
private fun parseInt (str: String): String? {
    try {
        return str.toInt().toString()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

class TryCatchExample : Example {
    override val name = "Try Catch"

    override fun getValues(): List<ExampleValue> {
        return listOf(
                ExampleValue("ParseInt(8)", parseInt("8").toString()),
                ExampleValue("ParseInt(null)", parseInt("l").toString())
        )
    }
}