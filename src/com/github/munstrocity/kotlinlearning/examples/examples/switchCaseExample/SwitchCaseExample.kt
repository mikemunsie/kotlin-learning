package com.github.munstrocity.kotlinlearning.examples.examples.switchCaseExample

import com.github.munstrocity.kotlinlearning.examples.examples.Example
import com.github.munstrocity.kotlinlearning.examples.examples.ExampleValue

// To create an object, you won't need the new keyword
// Switch statements use when
private class Transformer (private val words: List<String>) {
    fun transform(): List<String> {
        return words.map {
            when (it) {
                "Hello" -> "Hi"
                "World" -> "Universe"
                else -> "?"
            }
        }
    }
}

class SwitchCaseExample : Example {
    override val name = "Switch Case"

    override fun getValues(): List<ExampleValue> {
        val myArrayOfWords = listOf("Hello", "World")
        return listOf(
                ExampleValue("myArrayOfWords", myArrayOfWords.joinToString(" ")),
                ExampleValue("Transformer(myArrayOfWords)", Transformer(myArrayOfWords).transform().joinToString(" "))
        )
    }
}