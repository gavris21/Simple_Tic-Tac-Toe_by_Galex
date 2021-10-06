fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    var count = 0
    for (i in 2 until numbers.size) {
        if (numbers[i] - numbers[i - 1] == 1 && numbers[i - 1] - numbers[i - 2] == 1) count++
    }
    println(count)
}