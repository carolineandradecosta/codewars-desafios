
fun main(){
    val numeros: IntArray = intArrayOf(1, 2, 3, -4, 0)
    val result: Int = sum(numeros)
    println(result)
}

fun sum(numbers: IntArray): Int {
    var sum: Int = 0

    //for(i in numbers){                      Index -3 out of bounds for length 5 (funciona sem numero negativo)
    //for(i in 0..(numbers.size)){            Index 5 out of bounds for length 5
    // não entendi porque o for só funcionou dessa forma

   // for(number in numbers)            outra forma de usar o for
    for(i in 0..(numbers.size) -1){
        if (numbers[i] > 0){
           sum += numbers[i]
        } else {
            sum += 0
        }
    }

    return sum
}




