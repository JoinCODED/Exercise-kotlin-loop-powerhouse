fun countUpwards(start: Int, end: Int) {
    for (number in start..end) {
        println(number)
    }
}

fun countDownwards(end: Int, start: Int) {
    var current = end
    while (current >= start) {
        println(current)
        current--
    }
}

fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (number in numbers) sum += number
    return sum
}

fun checkEvenOdd(number: Int) {
    println("Even:")
    for (current in 1..number){
        if (current % 2 == 0) println(current)
    }
    println("Odd:")
    for (current in 1..number){
        if (current % 2 != 0) println(current)
    }
}

fun calculateFactorial(number: Int): Int {
    var factorial = 1
    for (current in 1..number) factorial *= number
    return factorial
}

fun untilZero() {
    do {
        println("Enter a number:")
        val enteredNumber = readLine()?.toInt()
    } while (enteredNumber != 0)
    println("Done! You entered zero.")
}

fun printMultiplicationTable(size: Int) {
    for (i in 1..size) {
        for (j in 1..size) {
            val product = i * j
            print("$product ")
        }
        println()
    }
}