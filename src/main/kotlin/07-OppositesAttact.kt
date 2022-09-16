
fun main(){
    println(loveFun(2, 2))

}
/*fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    if((flowerA % 2 == 0) && (flowerB % 2 != 0)){
        return true
    } else if ((flowerB % 2 == 0) && (flowerA % 2 != 0)){
        return true
    } else return false
}*/

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return ((flowerA % 2 == 0) or (flowerB % 2 == 0)) && ((flowerA % 2 != 0) or (flowerB % 2 != 0))
    /*        return true
    } else return false*/
}

// resolução de Kamila abaixo
/*fun loveFun(flowerA: Int, flowerB: Int): Boolean{
    return (flowerA % 2 == 0) && (flowerB % 2 != 0) || (flowerB % 2 == 0) && (flowerA % 2 != 0)
}*/

