fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var result = "YES"
    for (i in 0 until numbers.lastIndex) {
        if (numbers.subList(i, i + 2).contains(n) && numbers.subList(i, i + 2).contains(m)) result = "NO"
    }
    println(result)
    /*println(n)
    println(m)
    println(numbers.subList(1, 2).joinToString(" "))*/
    /*val list = mutableListOf("fg", 1, 'l')
    val list1 = list + numbers
    println(list1)*/
    val list = mutableListOf(mutableListOf("24","hj"), mutableListOf("54", "jhh", "gjjh"))

}