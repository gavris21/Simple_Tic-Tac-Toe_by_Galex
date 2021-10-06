fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    var rotate = readLine()!!.toInt()
    /*val last = numbers.lastIndex
    val size = numbers.size
    if (rotate > size) rotate %= size
    val numbersRes = mutableListOf<Int>()
    for (i in last downTo last - rotate + 1) {
        numbersRes.add(numbers[i])
        //numbers.removeAt(last)
    }
    for (i in 0..last - rotate) {
        numbersRes.add(numbers[i])
    }
    print(numbersRes.joinToString(" "))
    //println(numbers.subList(0, last + 1).joinToString(" "))*/
    val size = numbers.size
    if (rotate >= size) rotate %= size
    repeat(rotate) {
        numbers.add(0, numbers.last())
        numbers.removeAt(numbers.lastIndex)
    }
    println(numbers.joinToString(" "))
}