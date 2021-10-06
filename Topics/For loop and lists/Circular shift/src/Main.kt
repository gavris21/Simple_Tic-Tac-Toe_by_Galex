fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    numbers.add(0, numbers.last())
    numbers.removeAt(numbers.lastIndex)
    println(numbers.joinToString(" "))
}