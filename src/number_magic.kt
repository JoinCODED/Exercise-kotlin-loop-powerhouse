fun main() {
    countUpwards(0, 10)
    countDownwards(10, 0)
    println(calculateSum(intArrayOf(10, 5, 9, 15)))
    checkEvenOdd(13)
    println(calculateFactorial(6))
}

fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i)
    }
}

fun countDownwards(end: Int, start: Int) {
    var step = end;
    while(step >= start) {
        println(step)
        step -= 1
    }
}

fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun checkEvenOdd(number: Int) {
    for (num in 1..number) {
        if (num % 2 == 0) println("$num is Even") else println("$num is Odd")
    }
}

fun calculateFactorial(start: Int): Int {
    var calculatedFactorial = 1
    for (num in start downTo 1) {
        calculatedFactorial *= num
    }
    return calculatedFactorial;
}