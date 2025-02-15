fun main() {
    countUpwards(1, 5)
    println("-------------------------")
    countDownwards(5, 1)
    println("------------Sum-------------")
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Sum: ${calculateSum(numbers)}")
    println("-------------Even or odd------------")
    checkEvenOdd(5)
    println("------------Factorials-------------")
    println("Factorial of 3: ${calculateFactorial(3)}")
    println("Factorial of 4: ${calculateFactorial(4)}")
    println("Factorial of 6: ${calculateFactorial(6)}")
    println("Factorial of 5: ${calculateFactorial(5)}")
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
            println("$i is Even")
        } else {
            println("$i is Odd")
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