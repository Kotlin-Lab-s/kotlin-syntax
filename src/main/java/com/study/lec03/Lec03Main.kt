package com.study.lec03

fun main() {
//    val number1 :Int? = 3
//    val number2: Long = number1?.toLong() ?: 0L
//    printAgeIfPerson(Person("",100))
    //val person = Person("최태현",100)
//    val name = "최태현"
//    println("이름: $name")
//    val str = """
//        ABC
//        EFG
//        ${name}
//    """.trimIndent()
//    println(str)

    val str = "ABC"
    println(str[0])
    println(str[2])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
//    if(obj is Person){
//        println(obj.age)
//    }
}