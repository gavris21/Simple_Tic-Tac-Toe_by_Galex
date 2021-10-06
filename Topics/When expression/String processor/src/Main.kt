fun main() {
    // write your code here
    val strA = readLine()!!
    val operator = readLine()!!
    val strB = readLine()!!
    when (operator) {
        "equals" -> println(strA == strB)
        "plus" -> println(strA + strB)
        "endsWith" -> println(strA.endsWith(strB))
        else -> println("Unknown operation")
    }
}