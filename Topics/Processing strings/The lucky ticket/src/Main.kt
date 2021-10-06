fun main() {
    // write your code here
    val input = readLine()!!.toCharArray().toMutableList()
    val sumA = input[0].digitToInt() + input[1].digitToInt() + input[2].digitToInt()
    val sumB = input[3].digitToInt() + input[4].digitToInt() + input[5].digitToInt()
    println(
        if (sumA == sumB) "Lucky" else "Regular"
    )
}