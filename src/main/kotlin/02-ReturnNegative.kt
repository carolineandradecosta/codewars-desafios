fun main(){
    println(makeNegative(x = 10))
}

fun makeNegative(x: Int): Int {
        // your code here
    if (x > 0) {
        return x * (-1)
    }else if (x < 0){
        return x
    }else{
        return 0
    }
}
