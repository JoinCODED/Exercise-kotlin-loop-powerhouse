fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        print("$i ")
    }
    println()
}

fun countDownwards(end: Int, start: Int) {
    var i = end
    while (i >= start) {
        print("$i ")
        i--
    }
    println()
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

fun calculateFactorial(number: Int): Long {
    var factorial: Long = 1
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}
fun main() {
    println("Counting Upwards from 1 to 10:")
    countUpwards(1, 10)


    println("Counting Downwards from 20 to 1:")
    countDownwards(20, 1)

    val numbers = intArrayOf(11, 2, 32, 4, 15)
    println("Sum of numbers: ${calculateSum(numbers)}")


    println("Checking Even/Odd for numbers from 1 to 16:")
    checkEvenOdd(16)


    println("Factorial of 9: ${calculateFactorial(9)}")
}