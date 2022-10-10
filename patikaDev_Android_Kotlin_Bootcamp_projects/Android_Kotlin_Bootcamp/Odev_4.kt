package Android_Kotlin_Bootcamp

// 5.
// Questions Mark Have the function QuestionsMarks(str)
// take the str string parameter, which will contain single digit numbers, letters, and question marks,
// and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
// If so, then your program should return the string true, otherwise it should return the string false.
// If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
// For example: if str is "arrb6???4xxbl5???eee5" then your program should return true
// because there are exactly 3 question marks between 6 and 4,
// and 3 question marks between 5 and 5 at the end of the string.
// Examples Input: "aa6?9" Output: false Input: "acc?7??sss?3rr1??????5" Output: true
// private fun questionsMarks(str: String): String {}

fun main(){
    println("Enter a random string as you wish : ")
    val input = readLine()!!.toString()
    println(questionsMarks(input))
}

fun questionsMarks(str: String): String{
    var sumOfTwoDigit: Int = 0
    var questionMarkCounter: Int = 0
    var check: Boolean = false
    var amIinNums: Boolean = false
    for(x in str){
        if(x.isDigit()){
            sumOfTwoDigit = sumOfTwoDigit + x.digitToInt()
            amIinNums = true
        }
        if(x == '?' && amIinNums){
            questionMarkCounter++
        }
        if(sumOfTwoDigit == 10 && questionMarkCounter == 3){
            sumOfTwoDigit = 0
            questionMarkCounter = 0
            check = true
            amIinNums = false
        }else{
            check = false
        }
    }
    return check.toString()
}