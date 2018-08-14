package com.github.munstrocity.kotlinlearning.examples

interface Example {
    val name: String
    fun getValues(): List<ExampleValue>
}