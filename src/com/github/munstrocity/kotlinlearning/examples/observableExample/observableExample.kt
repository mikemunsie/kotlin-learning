package com.github.munstrocity.kotlinlearning.examples.observableExample

import com.github.munstrocity.kotlinlearning.examples.Example
import com.github.munstrocity.kotlinlearning.examples.ExampleValue
import kotlin.properties.Delegates


private class User {

    // This sets up an observable which will watch for changes on the property
    var name: String by Delegates.observable("no name") { _, old, new ->
        println("$old -> $new")
    }
}

class ObservableExample : Example {
    override val name = "Observable"
    private val user = User()

    private fun changeName(value: String): String {
        user.name = value
        return user.name
    }

    override fun getValues(): List<ExampleValue> {
        return listOf(
                ExampleValue("Change name to Carl", changeName("carl")),
                ExampleValue("Change name to Mike", changeName("mike"))
        )
    }
}