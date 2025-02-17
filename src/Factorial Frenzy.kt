fun main() {
    println(calculateFactorial(5))
}
fun calculateFactorial(number: Int): Int{
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}