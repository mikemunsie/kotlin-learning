package com.github.munstrocity.kotlinlearning.examples.examples

interface Example {
    val name: String
    fun getValues(): List<ExampleValue>
}