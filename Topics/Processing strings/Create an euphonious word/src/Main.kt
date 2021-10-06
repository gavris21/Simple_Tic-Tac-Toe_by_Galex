fun main() {
    // write your code here
    var input = readLine()!!.lowercase()
    val vowels = "aeiouy"
    var count = 0
    for (i in 2 until input.length) {
        if (vowels.contains(input[i - 2]) && vowels.contains(input[i - 1]) && vowels.contains(input[i])) {
            count++
            input = input.substring(0, i - 1) + "G" + input.substring(i, input.length)
        }
        if (!vowels.contains(input[i - 2]) && !vowels.contains(input[i - 1]) && !vowels.contains(input[i])) {
            count++
            input = input.substring(0, i - 1) + "a" + input.substring(i, input.length)
        }
    }
    println(count)
}