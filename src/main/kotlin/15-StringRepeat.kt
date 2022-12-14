//DESCRIPTION:
//Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
//
//Examples (input -> output)
//6, "I"     -> "IIIIII"
//5, "Hello" -> "HelloHelloHelloHelloHello"

fun main(){
    println(repeatStr(6, "Mel"))
}

fun repeatStr(r: Int, str: String): String{
    return str.repeat(r)
}

// MelMelMelMelMelMel