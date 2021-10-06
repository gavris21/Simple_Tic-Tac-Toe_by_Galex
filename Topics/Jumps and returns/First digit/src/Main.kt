fun main() {
    // put your code here
    /*val input = readLine()!!
    for (ch in input) {
        if (ch.isDigit()) {
            println(ch)
            return
        }
    }*/
    for (i in 1..4) {
        loop@ for (j in 1..3) {
            for (k in 1..2) {
                if (i == 2 || j == 3 || k == 2) break@loop
                print("$k")
            }
        }
    }
}