fun main() {
    countUpwards(3,7)
    countDownwards(3,7)
}
fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i)
    }
}

    fun countDownwards(start: Int, end: Int) {
        var i = end
        while (i >= start) {
            println(i)
            i--
        }
}

