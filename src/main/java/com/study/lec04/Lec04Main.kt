package com.study.lec04

fun main() {

//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//
//    if(money1 > money2){
//        println("Money1이 Money2보다 큽니다.")
//    }
//    val money1 = JavaMoney(1_000L)
//    val money2 = money1
//    val money3 = JavaMoney(1_000L)
//
//    println(money1 == money2)
//    println(money1 == money3)
//    println(money1 === money3)

//    if(fun1()|| fun2()){
//        println("본문")
//    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}