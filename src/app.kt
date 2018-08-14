// To create an object, you won't need the new keyword
// Switch statements use when
class Transformer (private val words: Array<String>) {
    fun transform(): List<String> {
        return words.map {
            when (it) {
                "Hello" -> "Hi"
                "World" -> "Universe"
                else -> "?"
            }
        }
    }
}

// Quick easy way to print stuffs
fun printResults (resultsMap: Map<String, String?>) {
    for ((name, result) in resultsMap) {
        println("")
        println(name)
        println("==============================")
        println(result)
    }
}

// No ternary operators needed
fun max(a: Int, b: Int) = if (a > b) a else b

// The ? indicates the value can be nullable
fun parseInt (str: String): String? {
    try {
        return str.toInt().toString()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

// Easy type checking
fun isString(str: Any): Boolean {
    return str is String
}

fun main(args: Array<String>) {
    val myArrayOfWords = arrayOf("Hello", "World")

    printResults(mapOf(
            "Original Array" to myArrayOfWords.joinToString(" "),
            "Transformed Array" to Transformer(myArrayOfWords).transform().joinToString(" "),
            "Max" to max(10, 20).toString(),
            "ParseInt" to parseInt("8"),
            "ParseInt(null)" to parseInt("l"),
            "isString (a)" to isString("a").toString(),
            "isString (1)" to isString(2).toString()
    ))
}
