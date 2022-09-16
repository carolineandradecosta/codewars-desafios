
/*DESCRIPTION:
Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since midnight in milliseconds.

Example:
h = 0
m = 1
s = 1

result = 61000
Input constraints:

0 <= h <= 23
0 <= m <= 59
0 <= s <= 59*/

fun main(){
    println(horarioEmMs(1,0,1))
}

fun horarioEmMs(h: Int, m: Int, s: Int): Int{
    return (h*3600000) + (m*60000) + (s*1000)
}

// result= 3601000

obs.:
// 1 h = 3,6e+6 ou 3600000 milissegundos
// 1 min = 60000 milissegundos
// 1 segundo = 1000 milissegundos