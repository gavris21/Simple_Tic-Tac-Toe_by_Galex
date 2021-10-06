fun main() {
    // write your code here
    val numCompanies = readLine()!!.toInt()
    val companiesIncome = MutableList(numCompanies) { readLine()!!.toInt() }
    val taxesRates = MutableList(numCompanies) { readLine()!!.toInt() }
    val taxes = mutableListOf<Int>()
    for (i in 0 until companiesIncome.size) {
        taxes.add(companiesIncome[i] * taxesRates[i])
    }
    println(taxes.indexOf(taxes.maxOrNull()) + 1)
}