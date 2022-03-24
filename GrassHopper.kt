fun main() {
    val summation =  GrassHopper.summation(8)
    print("summation = ${summation}")
}
object GrassHopper {
    fun summation(n:Int):Int {
        var sum = 0
        for (i in 1..n) {
            sum+=i
        }
        return sum
    }
}