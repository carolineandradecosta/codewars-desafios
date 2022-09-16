
fun main (){
    println(hero(10, 5))
}

fun hero(bullets: Int, dragons: Int) : Boolean {
    return (bullets/2) >= dragons
}

/* escrevi assim, mas fica sublinhado

fun hero(bullets: Int, dragons: Int) : Boolean {
    if((bullets/2 >= dragons)){
        return true
    } else {
        return false
    }
}*/

/* outra solução no codewars

fun hero(bullets: Int, dragons: Int) = bullets >= dragons * 2
* */
