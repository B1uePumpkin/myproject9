package com.bluepumpkin


class PersonKotlin {
    fun greeting(){
        println("hello kotlin")
    }
}

//top-level
fun main() {
    val p=PersonKotlin()
    p.greeting()
}