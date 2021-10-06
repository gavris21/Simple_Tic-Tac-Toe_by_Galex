fun main() {
    // write your code here
    val input = readLine()!!
    println(
        input.replace('-', '/').substring(5) +
            "/${input.substring(0, 4)}"
    )
}