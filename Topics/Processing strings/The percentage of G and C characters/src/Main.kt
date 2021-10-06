fun main() {
    // write your code here
    val input = readLine()!!.lowercase()
    var gc = 0
    for (ch in input) {
        if (ch == 'g' || ch == 'c') gc++
    }
    val result = gc.toDouble() / input.length * 100
    println(result)
}