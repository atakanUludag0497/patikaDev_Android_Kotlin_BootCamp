package Android_Kotlin_Bootcamp

/*
 First Factorial
 Have the function FirstFactorial(num) take the num parameter being passed and
 return the factorial of it.
 For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
 For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 Examples Input:
 4 Output: 24
 Input: 8
 Output: 40320
 private fun first Factorial(num: Int): Int { }
*/

fun main(){
    println("Enter a number to take factorial of it : ")
    val input = readLine()!!.toInt()
    firstFactorial(input)
}

fun firstFactorial(num:Int): String{
    var factorial: Int = 1;
    var temp: Int = num
    print("(")
    for(i in 1..num){
        factorial = factorial * i
        if(temp == 1){
            print("" + temp)
        }else{
            print("" + temp + " * ")
        }
        temp--
    }
    print(")" + " = " + factorial)
    return "factorial = " + factorial
}