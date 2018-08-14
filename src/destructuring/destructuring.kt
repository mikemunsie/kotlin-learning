package destructuring

data class Result(
    val result: Int,
    val status: String
)

fun ex1 (): Result {
    val result = 1
    val status = "Good Status"
    return Result(result, status)
}

class Ex2<K, V>(val first: K, val second: V) {

    // When destructuring, this is the first result returned
    operator fun component1(): K {
        return first
    }

    // When destructuring, this is the second result returned
    operator fun component2(): V {
        return second
    }
}

fun getValues (): Array<Pair<String, String>> {
    val (ex1_1, ex1_2) = ex1()
    val (ex2_1, ex2_2) = Ex2(1, 2)
    return arrayOf(
            Pair("ex1", "$ex1_1, $ex1_2"),
            Pair("ex2", "$ex2_1, $ex2_2")
    )
}