fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    var count = 0
    for (item in numbers) {
        if (item == m) count++
    }
    println(count)
}