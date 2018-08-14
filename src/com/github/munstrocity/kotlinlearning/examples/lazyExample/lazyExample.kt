package com.github.munstrocity.kotlinlearning.examples.lazyExample

import com.github.munstrocity.kotlinlearning.examples.Example
import com.github.munstrocity.kotlinlearning.examples.ExampleValue


// Lazy Values are not calculated until you call them. They are only calculated once and will remember the value
// in future calls. You should only see the println one time.

private class LazySample {
    val lazy: String by lazy {
        println("computed!")
        "my lazy"
    }
}

class LazyExample : Example {
    override val name = "Lazy"
    override fun getValues(): List<ExampleValue> {
        val sample = LazySample()
        return listOf(
                ExampleValue("Lazy Val call 1", sample.lazy),
                ExampleValue("Lazy Val call 2", sample.lazy)
        )
    }
}