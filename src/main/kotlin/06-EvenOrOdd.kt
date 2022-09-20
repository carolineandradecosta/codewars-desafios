//DESCRIPTION:
//Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

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

// Even