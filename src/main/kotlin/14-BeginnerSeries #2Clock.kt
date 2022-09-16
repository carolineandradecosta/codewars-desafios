
fun main(){
    println(horarioEmMs(1,0,1))

}

fun horarioEmMs(h: Int, m: Int, s: Int): Int{
    return (h*3600000) + (m*60000) + (s*1000)
}

// 1 h = 3,6e+6 ou 3600000
// 1 min = 60000
// 1 segundo = 1000