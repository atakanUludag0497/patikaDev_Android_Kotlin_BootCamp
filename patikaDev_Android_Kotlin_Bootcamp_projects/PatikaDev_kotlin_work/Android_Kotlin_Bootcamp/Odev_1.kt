package Android_Kotlin_Bootcamp

import java.util.regex.Pattern

// Code user name validation
// Have the function Codeland Username Validation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:
// 1. The username is between 4 and 25 characters.
// 2. It must start with a letter.
// 3. It can only contain letters, numbers, and the underscore character.
// 4. It cannot end with an underscore character. If the username is valid then your program should return the string true, otherwise return the string false.
// Examples Input: "aa_"
// Output: false
// Input: "u__hello_world123"
fun main(){
    println("Enter user name : ")
    var stringInput = readLine()!!
    println(codeLandUsernameValidation(stringInput))
}

fun codeLandUsernameValidation(str: String): String{
    val userNamePattern = Pattern.compile("""^[_A-z0-9]*((\s)*[_A-z0-9])*${'$'}""")
    if(str.length < 4 || str.length > 25){
        return "false"
    }
    if(!str[0].isLetter()){
        return "false"
    }
    if(!userNamePattern.matcher(str).matches()){
        return "false"
    }
    if(str[str.length-1] == '_'){
        return "false"
    }
    return "true"
}