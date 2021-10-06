const val ZERO_NUMBER = 0
fun main() {
    // write your code here
    val testList = MutableList(3) {
        MutableList(3) {
            MutableList(3) { ZERO_NUMBER }
        }
    }
    println(testList)
}