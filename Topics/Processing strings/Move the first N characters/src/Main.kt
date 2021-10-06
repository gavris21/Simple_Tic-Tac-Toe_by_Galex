fun main() {
    // write your code here
    val (text, num) = readLine()!!.split(" ")
    val n = num.toInt()
    if (n <= text.length) {
        println(text.substring(n) + text.substring(0, n))
    } else println(text)
}