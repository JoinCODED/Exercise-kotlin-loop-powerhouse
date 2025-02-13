fun main() {
    countUpwards(start=0, end=10);
    countDownwards(end = 10, start=0);
    println(calculateSum(intArrayOf(1, 2, 3, 4)));
    checkEvenOdd(13);
    println(calculateFactorial(5))
}

fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        println(i);
    }
}

fun countDownwards(end: Int, start: Int) {
    var step = end;
    while(step >= start) {
        println(step);
        step -= 1;
    }
}

fun calculateSum(numbers: IntArray): Int {
    var sum = 0;
    for (elem in numbers) {
        sum += elem;
    }
    return sum; // or simply
    // return numbers.reduce { acc, i -> acc + i };
}

fun checkEvenOdd(number: Int) {
    for (num in (1..number).toList()) {
        if (num % 2 == 0) println("$num - Even") else println("$num - Odd");
    }
}

fun calculateFactorial(start: Int): Int {
    var result: Int = 1;
    for (num in (start downTo 1).toList()) {
        result *= num;
    }
    return result;
}
