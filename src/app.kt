import debug.*

fun main(args: Array<String>) {
    val results = arrayOf(
            DebugResult("Destructuring", destructuring.getValues()),
            DebugResult("HashMap", hashmap.getValues()),
            DebugResult("SwitchCase", switchCase.getValues()),
            DebugResult("TypeChecking", typeChecking.getValues()),
            DebugResult("TryCatch", tryCatch.getValues()),
            DebugResult("Ternary", ternary.getValues())
    )

    printResults(results)
}
