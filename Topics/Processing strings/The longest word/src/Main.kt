fun main() {
    // write your code here
    val input = readLine()!!.split(" ")
    println(input.maxByOrNull { it.length })
}