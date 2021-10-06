import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val n = scanner.nextInt()
    val upCase = ('A'..'Z').toMutableList()
    val lowCase = ('a'..'z').toMutableList()
    val digits = (0..9).toMutableList()
    for (i in 0 until a) {
        if (i > 25) {
            print(upCase[i % 24])
        } else print(upCase[i])
    }
    for (i in 0 until b) {
        if (i > 25) {
            print(lowCase[i % 24])
        } else print(lowCase[i])
    }
    for (i in 0 until c) {
        if (i > 8) {
            print(digits[i % 7])
        } else print(digits[i])
    }
    if (a + b + c < n) {
        for (i in a until a + n - a - b - c) {
            if (i > 25) {
                print(upCase[i % 24])
            } else print(upCase[i])
        }
    }
}