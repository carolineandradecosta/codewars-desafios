//DESCRIPTION:
//Build a function that returns an array of integers from n to 1 where n>0.
//
//Example : n=5 --> [5,4,3,2,1]

fun main(){
    println(reverseSeq(5))

}
fun reverseSeq(n: Int): List<Int> {
    val sequencia: MutableList<Int> = mutableListOf()

    for (i in n downTo 1){
        sequencia.add(i)
    }
    return sequencia
}
// [5, 4, 3, 2, 1]