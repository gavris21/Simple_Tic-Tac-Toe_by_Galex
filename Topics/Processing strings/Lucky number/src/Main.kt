fun main() {
    // write your code here
    val input = readLine()!!
    val arr = input.chunked(input.length / 2).map { it.map(Char::digitToInt).sum() }
    println(
        if (arr[0] == arr[1]) "YES" else "NO"
    )
}