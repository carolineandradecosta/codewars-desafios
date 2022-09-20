//DESCRIPTION:
//
//Kata Task
//I have a cat and a dog.
//
//I got them at the same time as kitten/puppy. That was humanYears years ago.
//
//Return their respective ages now as [humanYears,catYears,dogYears]
//
//NOTES:
//humanYears >= 1
//humanYears are whole numbers only
//
//Cat Years
//15 cat years for first year
//+9 cat years for second year
//+4 cat years for each year after that
//
//Dog Years
//15 dog years for first year
//+9 dog years for second year
//+5 dog years for each year after that

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

// [10, 56, 64]