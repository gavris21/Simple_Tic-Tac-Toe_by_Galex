fun main() {
    // write your code here
    when (readLine()!!) {
        "0" -> println("do not move")
        "1" -> println("move up")
        "2" -> println("move down")
        "3" -> println("move left")
        "4" -> println("move right")
        else -> println("error!")
    }
}