// counting upwards function
fun countUpwards(start: Int, end: Int){
    for(i in start .. end){
        println("Counting upwards: $i")
    }
}

// counting downwards function
fun countDownwards(end: Int, start: Int){
    var i = end // i = 5
    while(i >= start ){ // i = 5 - start = 1
        println("Counting downwards: $i")
        i--
    }

}

//sum the array using a loop
fun calculateSum(numbers: IntArray){
//    var number: Int = 0
    var sum: Int = 0
    // using indices to iterate over the range of numbers etc... 0 to 5
    for (i in numbers.indices)
        sum += numbers[i] // adding the value to sum
    println(sum)
}

// print all even or odd numbers in range 1 to number
fun checkEvenOdd(number: Int){
    val evenNumbers: MutableList<Int> = mutableListOf()
    val oddNumbers: MutableList<Int> = mutableListOf()
    for(i in 1..number){
        if(i % 2 == 0){
            println("\nNumber is even $i")
            evenNumbers.add(i)
        }
        else{
            println("Number is odd $i")
            oddNumbers.add(i)
        }
    }
    println("Even numbers are $evenNumbers")
    println("Even numbers are $oddNumbers")
}

fun calculateFactorial(number: Int){
    var factorial = 1
    for (i in 1..number)
        factorial = factorial * i
    println("\nThe sum of $number! is: $factorial")
}

fun main() {
    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)
    // counting upwards
    countUpwards(1,5)

    // counting downwards
    countDownwards(5,1)

    // summing numbers from Int Array
    calculateSum(numbers)

    // even or odd numbers
    checkEvenOdd(10)

    // factorial
    calculateFactorial(7)

}