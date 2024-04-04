package com.study.lec04

data class Money (
    val amount: Long
    ){
    operator fun plus(money: Money): Money {
        return Money(amount + money.amount)
    }
}