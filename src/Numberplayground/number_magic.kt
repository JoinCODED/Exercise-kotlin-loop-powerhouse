fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    countUpwards(1, 10)
    countDownwards(10, 1)

    val sum = calculateSum(numbers)
    println(sum)

    checkEvenOdd(10)

    val factorial = calculateFactorial(5)
    println(factorial)
}

fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i)
    }
}

fun countDownwards(end: Int, start: Int) {
    var i = end
    while (i >= start) {
        println(i)
        i--
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
    for (i in 1..number) {
        if (i % 2 == 0) {
            println("$i is even")
        } else {
            println("$i is odd")
        }
    }
}

fun calculateFactorial(number: Int): Int {
    var factorial = 1
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}
