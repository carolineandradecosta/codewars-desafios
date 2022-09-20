//DESCRIPTION:
//Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
//
//Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.

fun main(){
    println(loveFun(2, 2))

}
// Descobrir pq não funciona
/*fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    if((flowerA % 2 == 0) && (flowerB % 2 != 0)){
        return true
    } else if ((flowerB % 2 == 0) && (flowerA % 2 != 0)){
        return true
    } else return false
}*/

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return ((flowerA % 2 == 0) or (flowerB % 2 == 0)) && ((flowerA % 2 != 0) or (flowerB % 2 != 0))

}
// false

//resolução de Kamila abaixo (descobrir pq não funciona)
/*fun loveFun(flowerA: Int, flowerB: Int): Boolean{
    return (flowerA % 2 == 0) && (flowerB % 2 != 0) || (flowerB % 2 == 0) && (flowerA % 2 != 0)
}*/

