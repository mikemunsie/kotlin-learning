package com.github.munstrocity.kotlinlearning.koans.introduction

const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

// Match against: 13 JUN 1992 (two digits, a whitespace, a month abbreviation, a whitespace, four digits).
fun stringsPattern1(str: String): String {
    val pattern = """\d{2} $month \d{4}""".toRegex()
    return pattern.replace(str) { it.value }
}