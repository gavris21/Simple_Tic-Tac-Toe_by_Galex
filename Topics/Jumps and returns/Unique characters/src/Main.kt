fun main() {
    // put your code here
    val input = readLine()!!
    var count = 0
    for (i in input.indices) {
        var temp = 0
        for (ch in input) {
            if (ch == input[i]) temp++
        }
        if (temp == 1) count++
    }
    println(count)
}