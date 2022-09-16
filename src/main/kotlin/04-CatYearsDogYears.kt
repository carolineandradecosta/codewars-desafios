fun main(){
    var resultYears = (calculateYears(10))
    println(resultYears.contentToString())
}

fun calculateYears(years: Int): Array<Int> {
    var humanYears: Int = years
    var catYears: Int = 0
    var dogYears: Int = 0

    if (years == 1) {
        humanYears = years
        catYears = 15
        dogYears = 15
    } else if (years == 2){
        humanYears = years
        catYears = 24
        dogYears = 24
    } else {
        var addYears: Int = years - 2
        humanYears = years
        catYears = 24 + (addYears * 4)
        dogYears = 24 + (addYears * 5)
    }
    return arrayOf(humanYears, catYears, dogYears);
}