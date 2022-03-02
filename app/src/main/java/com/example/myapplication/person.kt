package com.example.myapplication

fun main(){
    val p =person()
    p.weight=65f
    p.height=1.7f
    println("${p.sayhello()}")
    println("your bmi is ${p.getbmi()}")

}

class person {
    var weight:Float = 0f
    var height:Float = 0f
    fun sayhello(){
        println("hello")
    }
    fun getbmi(): Float{
        val bmi = weight/ (height*height)
        return bmi
    }

}