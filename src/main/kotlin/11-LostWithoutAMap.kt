//DESCRIPTION:
//Given an array of integers, return a new array with each value doubled.
//
//For example:
//
//[1, 2, 3] --> [2, 4, 6]
fun main(){
    // dificuldade aqui, ter que guardar em várias variáveis até conseguir enxergar o resultado final

    val numeros: IntArray = intArrayOf(1,2,3)
    val resultMaps: IntArray = maps(numeros)
    println(resultMaps.contentToString())

}

fun maps(x: IntArray): IntArray{
    for (indice in x.indices){
        x[indice] = x[indice] * 2
    }
    return x
}
// [2, 4, 6]