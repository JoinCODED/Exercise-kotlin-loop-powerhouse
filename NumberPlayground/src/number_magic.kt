fun main() {

    fun countUpwards(start: Int, end: Int) {
        for (i in start..end) {
            println(i)
        }
        println()
    }

    fun countDownwards(end: Int, start: Int) {
        var i = end
        while (i >= start) {
            println(i)
            i--
        }
        println()
    }

    fun calculateSum(numbers: IntArray): Int {
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        println()
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
        println()
    }

    fun calculateFactorial(number: Int): Int {
        var factorial = 1
        for (i in 1..number) {
            factorial *= i
        }
        println()
        return factorial
    }
//Bonus
    fun enterNumbers() {
        var number: Int
        do {
            print("Enter a number, 0 to exit: ")
            number = readLine()?.toIntOrNull() ?: 0 //check if not null converts the string input to an int
        } while (number != 0)
        println("Exited the loop")
        println()

    }

    fun multiTable(n: Int) {
        println("Multiplication Table:")
        for (i in 1..n) {
            for (j in 1..n) {
                print("${i * j}\t")
            }
            println()
        }
    }



    println("Counting Upwards:")
    countUpwards(1, 10)

    println("Counting Downwards:")
    countDownwards(10, 1)

    val numbers = intArrayOf(2, 5, 7, 10, 12)
    val sum = calculateSum(numbers)
    println("Sum of numbers: $sum")

    println("Even or Odd:")
    checkEvenOdd(10)

    println("Factorial of 5: " + calculateFactorial(5))


    //Bonus

    enterNumbers()
    multiTable(4)

}

