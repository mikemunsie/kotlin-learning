package typeChecking

// Easy type checking
fun isString(str: Any): Boolean {
    return str is String
}

fun getValues (): Array<Pair<String, String>> {
    return arrayOf(
            Pair("isString (a)", isString("a").toString()),
            Pair("isString (1)", isString(2).toString())
    )
}