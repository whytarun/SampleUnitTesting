package com.example.unittestexamples.utils

import java.lang.IllegalArgumentException

class Helper {
    fun isPallindrome(input:String) :Boolean{
        var i =0
        var j =input.length -1
        var result = true
        while (i < j){
            if(input[i] != input[i]){
                result =false
                break
            }
            i++
            j--
        }
        return result

    }

    fun validatePassword(input: String) =when{
        input.isBlank() ->{
            "password is required field"
        }
        input.length < 6 -> {
            "password should not be less than 6"
        }
        input.length >15 -> {
            "password should not be greater than 15"
        }
         else  ->{
            "valid"
        }

    }

    fun reverseString(input: String?) :String{
        if(input == null) {
            throw IllegalArgumentException(" input cannot be null")
        }
            val inputArray = input.toCharArray()
        var i =0
        var j =inputArray.size-1
        while(i< j){
            val temp =inputArray[i]
            inputArray[i] = inputArray[j]
            inputArray[j] = temp
            i++
            j--
        }
            return inputArray.joinToString("")
    }


}