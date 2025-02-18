fun main() {
    println("Upwards:")
    (countUpwards(5,10))
    println("\nDownwards:")
    countDownwards(5,1)


}
fun countUpwards(start: Int, end: Int){
for(i in start..end){
println(i)
    }
}
fun countDownwards(end: Int, start: Int){
    var i= end
    while(i >= start) {
        println(i)
        i--
    }
}
