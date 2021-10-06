import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // write your code here
    val room = readLine()!!
    when (room) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            // S = √ p * (p − a) * (p − b) * (p − c)  p = (a + b + c) : 2
            val p = (a + b + c) / 2
            val s = sqrt(p * (p - a) * (p - b) * (p - c))
            println(s)
        }
        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val s = a * b
            println(s)
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            val s = 3.14 * r.pow(2)
            println(s)
        }
    }
}