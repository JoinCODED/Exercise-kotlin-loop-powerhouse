import java.math.BigInteger

fun main() {
    countUpwards(0,9)
    println("-----------")
    countDownwards(10,0)

    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val result = calculateSum(numbers)
    println("Sum of numbers: "+result)

    checkEvenOdd(10)

    println( calculateFactorial(10))
}
fun countUpwards(start: Int, end: Int){

    for (number in start..end){
       println( number)
    }
}
fun countDownwards(start: Int, end: Int) {
    var number = start
    while (number >= end) {
        println(number)
        number--
    }
}

fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}
fun checkEvenOdd(number: Int) {
    for (num in 1..number) {
        if (num % 2 == 0) println("$num is even")
        else println("$num is odd")
    }
}
fun calculateFactorial(number: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 2..number) {
        result = result * i.toBigInteger()    }
    //big int used for bigger numbers
    return result
}