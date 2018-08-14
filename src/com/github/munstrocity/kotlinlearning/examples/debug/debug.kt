package com.github.munstrocity.kotlinlearning.examples.debug

import com.github.munstrocity.kotlinlearning.examples.examples.Example

// Quick easy way to print stuffs
fun printResults (results: List<Example>) {
    results.forEach { exampleClass ->
        println("")
        println("")
        println(exampleClass.name)
        println("==============================")
        exampleClass.getValues().forEach { value ->
            val (title, resultValue) = value
            println("")
            println("$title: $resultValue")
        }
    }
}