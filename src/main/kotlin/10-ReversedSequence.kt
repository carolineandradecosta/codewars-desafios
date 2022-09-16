
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


// consegui o resultado esperado dessa forma, mas não consegui reodar no codewars

// estava dando erro pq o tipo de retorno é List<Int> e eu achava que tinha que ser MutableList<Int>

/*fun reverseSeq(n: Int): MutableList<Int> {
    val sequencia: MutableList<Int> = mutableListOf()
        for (i in n downTo 1 step 1){
            sequencia.add(i)
        }
        return sequencia
}*/