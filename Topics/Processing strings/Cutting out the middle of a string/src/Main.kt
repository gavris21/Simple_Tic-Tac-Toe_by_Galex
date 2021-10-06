fun main() {
    // write your code here
    val input = readLine()!!
    if (input.length % 2 == 0) {
        for (i in input.indices) {
            if (i != input.length / 2 - 1 && i != input.length / 2) {
                print(input[i])
            }
        }
    } else {
        for (i in input.indices) {
            if (i != input.length / 2) {
                print(input[i])
            }
        }
    }
}