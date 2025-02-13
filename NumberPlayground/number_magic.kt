fun main(){
    countUpwards(1, 5)
    countDownwards(5, 1)
    checkEvenOdd(10)
    val numbers = listOf(1,5,6,7).toIntArray()
    println("Sum = ${calculateSum(numbers)}")
    var x: Int = 5
    println("${x}! = ${calculateFactorial(x)}")
}
// Step 1
fun countUpwards(start: Int, end: Int){
    for (num in start..end)
        print("$num ")
    println()
}
//Step 2
fun countDownwards(end: Int, start: Int){
    var index = end
    while(index >= start){
        print("$index ")
        index--
    }
    println()
}
// Step 3
fun calculateSum(numbers: IntArray): Int{
    var sum: Int = 0
    for (i in numbers)
        sum+=i
    return sum
}
// Step 4
fun checkEvenOdd(number: Int){
    val numbers: List<Int> = (1..number).toList()
    print("Even numbers from 1 to $number: ${numbers.filter { it % 2 == 0 }}")
    print("\nOdd numbers from 1 to $number: ${numbers.filter { it % 2 != 0 }}\n")
}
// Step 5
fun calculateFactorial(number: Int): Any{
    var factorial: Int = 1
    var num: Int = number
    if (num < 0)
        return "Number is negative!"
    else if(num == 0 || num == 1)
        return 1
    else {
        while (num > 0) {
            factorial = num * factorial
            num--
        }
        return factorial
    }
}