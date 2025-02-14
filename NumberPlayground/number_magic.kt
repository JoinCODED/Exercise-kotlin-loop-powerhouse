fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i)
    }
}

fun countDownwards(end: Int, start: Int) {
    var count = end
    while (count >= start) {
        println(count)
        count--
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
            println("Even: $i")
        } else {
            println("Odd: $i")
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
    println("Counting Upwards:")
    countUpwards(1, 5)

    println("Counting Downwards:")
    countDownwards(5, 1)

    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Sum of array: ${calculateSum(numbers)}")

    println("Even or Odd check up to 10:")
    checkEvenOdd(10)

    println("Factorial of 5: ${calculateFactorial(5)}")
}
