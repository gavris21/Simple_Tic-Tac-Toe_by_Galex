fun main() {
    val input = readLine()!!
    // write code here
    when {
        input == "" -> println(input)
        input.first() == 'i' -> println(input.substring(1).toInt() + 1)
        input.first() == 's' -> println(input.substring(1).reversed())
        else -> println(input)
    }
}