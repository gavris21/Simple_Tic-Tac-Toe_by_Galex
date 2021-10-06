fun main() {
    // write your code here
    val input = readLine()!!
    var count = 1
    if (input.length > 1) {
        for (i in 1 until input.length) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                print("${input[i - 1]}$count")
                count = 1
            }
            if (i == input.length - 1) {
                print("${input[i]}$count")
            }
        }
    } else {
        if (input.length == 1) {
            print("${input}1")
        } else println()
    }
}