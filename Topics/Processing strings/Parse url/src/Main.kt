fun main() {
    // write your code here    
    val url = readLine()!!
    val text = url.split("?").drop(1).joinToString().replace("=&", "=not found&").replace("=", " : ").split("&")
    for (param in text) println(param)
    for (param in text) {
        if (param.substring(0, 4) == "pass") println("password${param.substring(4)}")
    }
}