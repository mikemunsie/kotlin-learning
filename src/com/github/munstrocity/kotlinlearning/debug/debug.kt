package com.github.munstrocity.kotlinlearning.debug

import com.github.munstrocity.kotlinlearning.examples.Example

// Quick easy way to print stuffs
fun printResults (results: List<Example>) {
    results.forEach { exampleClass ->
        println("\n\n${exampleClass.name}")
        println("==============================")
        exampleClass.getValues().forEach { value ->
            val (title, resultValue) = value
            println("$title: $resultValue")
        }
    }
}

fun printResult (name: String, value: Any?) {
    println("$name: ${value.toString()}")
}