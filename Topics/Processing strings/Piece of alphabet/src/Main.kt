fun main() {
    // write your code here  
    val input = readLine()!!.lowercase().toCharArray().toMutableList()
    val abc = MutableList<Char>(input.size) { ' ' }
    for (i in input.indices) {
        abc[i] = input[0] + i
    }
    println(
        if (input == abc) "true" else "false"
    )
}