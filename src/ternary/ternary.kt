package ternary

// No ternary operators needed
fun max(a: Int, b: Int) = if (a > b) a else b

fun getValues (): Array<Pair<String, String>> {
    return arrayOf(
            Pair("max(10,20)", max(10, 20).toString())
    )
}