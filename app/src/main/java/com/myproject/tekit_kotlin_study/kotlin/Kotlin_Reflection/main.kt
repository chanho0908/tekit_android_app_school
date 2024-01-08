package com.myproject.tekit_kotlin_study.kotlin.Kotlin_Reflection

import kotlin.reflect.KClass

fun main(){
    val test1 = TestClass()
    // 클래스 타입
    // KClass<클래스타입> : 지정된 클래스의 타입을 파악한다(코틀린 클래스)
    val a1: KClass<String> = String::class
    println("String의 코틀린에서의 타입 : $a1")
    // Class<클래스타입> : 지정된 클래스의 타입을 파악한다(자바 클래스)
    val a2:Class<String> = String::class.java
    println("String의 자바에서의 타입 : $a2")

//    val a4:Class<out String> = str1::class.java
//    println("str1을 통해 접근할 수 있는 객체의 클래스 타입(자바) : $a4")
//
//    val a7 = test1::class
//    val a8 = test1::class.java
//    println("test1의 클래스 타입(코틀린) : $a7")
//    println("test1의 클래스 타입(자바) : $a8")

    // 클래스 정보 분석
    println("추상 클래스 인가 : ${test1::class.isAbstract}")
    println("Companion 클래스 인가 : ${test1::class.isCompanion}")
    println("Data 클래스 인가 : ${test1::class.isData}")
    println("Final 클래스 인가 : ${test1::class.isFinal}")
    println("open 클래스 인가 : ${test1::class.isOpen}")
    println("중첩 클래스 인가 : ${test1::class.isInner}")
    println("Sealed 클래스 인가 : ${test1::class.isSealed}")
}

class TestClass

