
fun main() {

    val numeros: IntArray = intArrayOf(1 , 2, 3)

    for ( index in numeros.indices){
        numeros[index] = numeros[index] * 2
    }
    print(numeros.contentToString())

}




