package debug

data class DebugResult(val name: String, val values: Array<Pair<String, String>>)

// Quick easy way to print stuffs
fun printResults (results: Array<DebugResult>) {
    for (result in results) {
        val (name, values) = result
        println("")
        println("")
        println("$name")
        println("==============================")
        for (value in values) {
            val (title, resultValue) = value
            println("")
            println("$title: $resultValue")
        }
    }
}