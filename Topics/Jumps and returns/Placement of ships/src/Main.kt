fun main() {
    // put your code here
    val ship1 = readLine()!!
    val ship2 = readLine()!!
    val ship3 = readLine()!!
    val field = MutableList(5) { MutableList<Int>(5) { 0 } }
    val rows = mutableListOf<Int>()
    val columns = mutableListOf<Int>()
    field[ship1[0].digitToInt() - 1][ship1[2].digitToInt() - 1] = 1
    field[ship2[0].digitToInt() - 1][ship2[2].digitToInt() - 1] = 1
    field[ship3[0].digitToInt() - 1][ship3[2].digitToInt() - 1] = 1
    for (i in field.indices) {
        if (field[i].sum() == 0) rows.add(i + 1)
    }
    for (j in 0..4) {
        var sum = 0
        for (i in 0..4) {
            sum += field[i][j]
        }
        if (sum == 0) columns.add(j + 1)
    }
    println(rows.joinToString(" "))
    println(columns.joinToString(" "))
}