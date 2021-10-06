fun main() {
    // write your code here
    val givenString = readLine()!!
    val subString = readLine()!!
    var count = 0
    if (givenString.length >= subString.length) {
        for (i in 0..givenString.length - subString.length) {
            if (givenString.substring(i, i + subString.length) == subString) {
                count++
            }
        }
    }
    println(count)
}