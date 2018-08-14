package com.github.munstrocity.kotlinlearning.examples.examples.typeCheckingExample

import com.github.munstrocity.kotlinlearning.examples.examples.Example
import com.github.munstrocity.kotlinlearning.examples.examples.ExampleValue

// Easy type checking
private fun isString(str: Any): Boolean {
    return str is String
}


class TypeCheckingExample : Example {
    override val name = "Type Checking"

    override fun getValues(): List<ExampleValue> {
        return listOf(
                ExampleValue("isString (a)", isString("a").toString()),
                ExampleValue("isString (1)", isString(2).toString())
        )
    }
}