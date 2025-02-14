import java.math.BigInteger

//Step 2: Counting Champions
fun countUpwards(start: Int, end: Int){
    print("Counting Upwards:  ")

    for(number in start..end){
        print(" $number  ")
    }
}

fun countDownwards(end: Int, start: Int){
    var number = end
    print("Counting Downwards:  ")

    while(number >= start){
        print(" $number  ")
        number--
    }
}

//Step 3: Summing Up Success
fun calculateSum(numbers: IntArray){
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    println("Sum = $sum")
}

//Step 4: Even or Odd?
fun checkEvenOdd(number: Int) {
    print("Even numbers:")
    for (i in 1..number) {
        if (i % 2 == 0) {
            print(" $i ")
        }
    }

    print("\nOdd numbers:")
    for (i in 1..number) {
        if (i % 2 != 0) {
            print(" $i ")
        }
    }
}

//Step 5: Factorial Frenzy
fun calculateFactorial(number: Int){
    var factorial = BigInteger.ONE
    for (i in 1..number) {
        factorial *= factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    print("Factorial of $number = $factorial")
}



fun main() {

    countUpwards(5,10)
    println()
    countDownwards(5, 0)
    println()
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    calculateSum(numbers)
    checkEvenOdd(10)
    println()
    calculateFactorial(7)

}