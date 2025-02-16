import javax.xml.stream.events.StartElement

fun main() {

    val result = countUpwards(1,5)
    println(result)

    val reverse = countDownwards(5,1)
    println(reverse)

    val numbers = intArrayOf(1,2,3,4,5)
    val sum = calculateSum(numbers)
    println(sum)

    

}

fun countUpwards(start: Int, end: Int): List<Int> {
   val numbers = mutableListOf<Int>()

    for (i in start..end) {
        numbers.add(i)
        println(i)
    }
    return numbers
}

fun countDownwards(end: Int, start: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    var lastNum = end

    while (lastNum >= start) {
        numbers.add(lastNum)
        println(lastNum)
        lastNum--


    }
    return numbers
}

 fun calculateSum(numbers: IntArray): Int {
     var sum = 0
     for (number in numbers) {
         sum += number

     }
     return sum

 }


