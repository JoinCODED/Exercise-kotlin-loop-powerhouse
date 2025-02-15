fun countUpwards(start: Int, end:Int)  {
   if (start > end) {
       println("$start > $end please enter a correct number to count upward")
   } else
    for (num in start..end) {
            println(num)
        }
}

fun countDownwards(end: Int, start: Int) {
    var i = start
if (end >= start) {
    println("$start >= $end please enter a correct number to count downward")
} else {
    while (i != end - 1) {
        println(i)
        i--
    }
}
}

fun calculateSum(numbers: IntArray)  {
   var sum: Int = 0
    for (num in numbers.indices) {
        sum += numbers[num]

    }
    println(sum)
}

fun checkEvenOdd(number: Int) {
    var i = 1
    val evenNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()
    while (i <= number) {
        if (i % 2 == 0) {
            evenNumber.add(i)
        } else  {
            oddNumber.add(i)
        }
        i++
    }
    println("Even numbers are: $evenNumber")
    println("Odd numbers are: $oddNumber")
}

fun calculateFactorial(number: Int){
    var i = number
    var factorial: Int = 1
    while (i >= 1) {
        factorial *= number
        i--
    }
    println("Factorial: $factorial")
}