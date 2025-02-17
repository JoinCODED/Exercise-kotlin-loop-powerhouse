fun main() {
    var numList = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val result = calculateSum(numList)
    println(result)
}
fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (i in numbers) {
        sum += i
    }
    return sum
}