fun countUpwards(start: Int, end: Int){
    for(i in start..end){
        println(i)
    }
}

fun countDownwards(end: Int, start: Int){
    var i = end
    while(i >= start){
        println(i)
        i--
    }
}

fun calculateSum(numbers: IntArray){
    var sum = 0
    for (i in numbers){
        sum += i
    }
    println(sum)
}

fun checkEvenOdd(number: Int) {
    if (number % 2 == 0) {
        println("Even numbers from 1 to $number:")
        for (i in 1..number) {
            if (i % 2 == 0) {
                print("$i, ")
            }
        }
    } else {
        println("Odd numbers from 1 to $number:")
        for (i in 1..number) {
            if (i % 2 != 0) {
                print("$i, ")
            }
        }
    }
    println() // used it for new line
}

fun calculateFactorial(number: Int){
    var factorial = 1

    for (i in 1..number) {
        factorial *= i
    }

    println(factorial)
}
fun main() {
    println("Hello World!")
    countUpwards(0,10)
    println("////////////////////")
    countDownwards(10,0)
    calculateSum(intArrayOf(1,2,3,4,5,6,7,8,9,10))
    checkEvenOdd(10)
    calculateFactorial(5)

}