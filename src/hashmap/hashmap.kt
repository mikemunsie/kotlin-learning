package hashmap

fun getValues (): Array<Pair<String, String>> {

    // How to add values into a hashmap
    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    var mapValue = ""
    for ((key, value) in map) {
        mapValue+= "\r\nkey = $key, value = $value"
    }

    return arrayOf(
            Pair("value of map", mapValue)
    )
}