fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(numbers.indexOf(numbers.maxOrNull()))
}