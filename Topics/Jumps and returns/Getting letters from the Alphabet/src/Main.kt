fun main() {
    // put your code here
    val abc = ('a'..'z').joinToString("")
    val letter = readLine()!![0]
    for (ch in abc) {
        if (ch == letter) return else print(ch)
    }
}