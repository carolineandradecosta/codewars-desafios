//DESCRIPTION:
//You get an array of numbers, return the sum of all of the positives ones.
//
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//Note: if there is nothing to sum, the sum is default to 0.

fun main(){
    val numeros: IntArray = intArrayOf(1, 2, 3, -4, 0)
    val result: Int = sum(numeros)
    println(result)
}

fun sum(numbers: IntArray): Int {
    var sum: Int = 0

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

// 6



