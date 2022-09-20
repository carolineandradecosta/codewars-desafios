//DESCRIPTION:
//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

fun main (){
    println(simpleMultiplication(5))
}

fun simpleMultiplication(n:Int): Int{
    if(n % 2 == 0){
        return n * 8
    } else {
        return n * 9
    }
}

// 45
