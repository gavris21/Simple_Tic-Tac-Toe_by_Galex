fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val lastNumbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    if (numbers.containsAll(lastNumbers)) println("YES") else println("NO")
}