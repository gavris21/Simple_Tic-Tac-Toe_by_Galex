fun main() {
    // put your code here
    val input = readLine()!!.lowercase()
    val list = ('a'..'z').toMutableList()
    for (ch in input) {
        list.remove(ch)
    }
    println(list.joinToString(""))
}