
fun main(){
    println(evenOrOdd(2))
}


fun evenOrOdd(number: Int): String {
    if (number % 2 == 0){
        return "Even"
    } else {
        return "Odd"
    }

}