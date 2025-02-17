fun main() {
    val numbers: IntArray = intArrayOf(1,2,3,4,5)
    countUpwards(1, 5)

    println("-----")

    countDownwards(5,1)

    println("-----")

    println(calculateSum(numbers))

    println("-----")

    checkEvenOdd(5)

    println("-----")

    println(calculateFactorial(5))
}

fun countUpwards(start: Int, end: Int) {
    for(i in start..end) {
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
    for (num in 1..number){
        if (num % 2 ==0 ){
            println("$num is even")
        }
        else {
            println("$num is odd")
        }
    }
}

fun calculateFactorial(number: Int): String {
    var calc = 1
    for (num in 1..number) {
        calc *= num
    }
    return "factorial of $number is $calc"
}