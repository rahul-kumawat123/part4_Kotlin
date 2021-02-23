package com.example.part4_kotlin

//WAP using Lambda function to calculate the Simple Interest.

class ques1 {
    fun simpleInterest(){
        println("---------------------------------------------------------------------------------")
        var si = {p:Int,r: Int , t:Int -> (p*r*t)/100}
        var result = si(10000,2,10)
        println("Simple Interest is: ${result}")
        println("---------------------------------------------------------------------------------")
    }
}