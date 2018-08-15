package com.github.munstrocity.kotlinlearning.koans.introduction

fun namedArgumentsExample(options: Collection<String>) = options.joinToString(
        separator = ",",
        prefix = "[",
        postfix = "]"
)