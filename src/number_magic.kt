//This was fun to code!!

fun main() {
    // Step 1: Counting Champions
    println("Counting Upwards (4 to 12):")
    countUpwards(4, 12)

    println("\nCounting Downwards (12 to 4):")
    countDownwards(12, 4)

    // Step 2: Summing Up Success
    val numbersArray = intArrayOf(10, 12, 31, 48, 50)
    println("\nSum of numbers in array: ${calculateSum(numbersArray)}")

    // Step 3: Even or Odd?
    println("\nEven and Odd numbers up to 10:")
    checkEvenOdd(10)

    // Step 4: Factorial Frenzy
    println("\nFactorial of 9: ${calculateFactorial(9)}")

    // Bonus Stage: Looping Legends
    println("\nTesting askForNumber function:")
    askForNumber() //  requires user input and enter 0 to exit

    println("\nMultiplication Table (8x8):")
    multiplicationTable(8)

    println("\nNumber Pyramid (Height 6):")
    pyramid(6)
}


// to print numbers from start to end using a for loop
fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i)
    }
}

// to print numbers from end to start using a while loop
fun countDownwards(end: Int, start: Int) {
    var i = end
    while (i >= start) {
        println(i)
        i--
    }
}

// to calculate the sum of all numbers in the array using a loop
fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (num in numbers) {
        sum = sum + num
    }
    return sum
}


// to print even and odd numbers in the range 1 to number
fun checkEvenOdd(number: Int) {
    for (i in 1..number) {
        if (i % 2 == 0) {
            println("Even numbers:")
            println(i)
        }
        else{
            println("Odd numbers:")
            println(i)
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

// Bonus
fun askForNumber() {
    var number: Int
    do {
        println("Please enter a number (Enter 0 to exit):")
        number = readLine()!!.toInt()  //asking the user to enter a number and to exit write 0
        if (number != 0) {
            println("You entered: $number")
        }
    } while (number != 0)
    println("You entered 0, exiting...")
}

fun multiplicationTable(size: Int) {
    for (i in 1..size) {
        for (j in 1..size) {
            print("${i * j}\t")
        }
        println()
    }
}

// print a number pyramid of a given height
fun pyramid(height: Int) {
    for (i in 1..height) {
        for (j in 1..(height - i)) {
            print(" ")
        }

        for (k in 1..i) {
            print("$k ")
        }
        println()
    }
}







