package tryCatch

// The ? indicates the value can be nullable
fun parseInt (str: String): String? {
    try {
        return str.toInt().toString()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

fun getValues (): Array<Pair<String, String>> {
    return arrayOf(
            Pair("ParseInt(8)", parseInt("8").toString()),
            Pair("ParseInt(null)", parseInt("l").toString())
    )
}