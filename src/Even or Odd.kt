fun main() {
    checkEvenOdd(20)

}
fun checkEvenOdd(number: Int) {
    var firstEven = 0
    println("Even numbers between 1 and $number :")
    for (i in 1..number) {
        if (i % 2 == 0) {
            firstEven++
            if (firstEven == 1) {
                print(i)
            } else {
                print(", $i")
            }
        }
    }
    println("\nOdd numbers between 1 and $number :")
    var firstOdd = 0
    for (i in 1..number) {
        if (i % 2 != 0) {
            firstOdd++
            if (firstOdd == 1) {
                print(i)
            } else {
                print(", $i")
            }
        }
    }

}