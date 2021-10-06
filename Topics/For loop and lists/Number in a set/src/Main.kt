fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    if (numbers.contains(m)) println("YES") else println("NO")
}