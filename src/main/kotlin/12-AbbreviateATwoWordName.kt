
fun main(){
    val nome: String = "gael costa"
    println(abbrevName(nome))
}
fun abbrevName(name:String): String {
    //val nameChar: CharArray =  name.toCharArray()

    val iniciais: String =(name[0]+ "."+ name[name.lastIndexOf(" ")+1])
    //val iniciaisM = iniciais.uppercase()
    return iniciais.uppercase()
}
// a solução da linha abaixo funciona tbm
// fun abbrevName(name:String) = (name[0]+ "."+ name[name.lastIndexOf(" ")+1]).toUpperCase()
// obs: no codewars só funcionou assim e na versão 1.5
// na verdade apenas o uppercase() na versão 1.5 não passou no segundo teste, pq?

// 01- converter a string em um array de char
// 02- pegar o primeiro elemento do array + . + segundo elemento

// dúvida: qual seria outra forma de pegar esses dois elementos?
// como seria pegar o primeiro ELEMENTO e não O índice dele no sobrenome?
