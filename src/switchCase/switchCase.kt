package switchCase

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

fun getValues (): Array<Pair<String, String>> {
    val myArrayOfWords = arrayOf("Hello", "World")
    return arrayOf(
            Pair("myArrayOfWords", myArrayOfWords.joinToString(" ")),
            Pair("Transformer(myArrayOfWords)", Transformer(myArrayOfWords).transform().joinToString(" "))
    )
}