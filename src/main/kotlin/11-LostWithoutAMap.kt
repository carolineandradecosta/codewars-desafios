
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