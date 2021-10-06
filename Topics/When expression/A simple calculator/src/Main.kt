fun main() {
    // write your code here
    val input = readLine()!!.split(" ")
    val a = input[0].toLong()
    val b = input[2].toLong()
    when (input[1]) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "/" -> if (b == 0L) println("Division by 0!") else println(a / b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
    var a = 10

    when (a) {
        11, 12 -> print("Ok")
        "2" -> print("Ok")
        in 1..22 -> print("Ok")
        > 0 -> print("Ok")
        a + a -> print("Ok")
        in 1..20 -> print("Ok"); print("Ok")
    }
}