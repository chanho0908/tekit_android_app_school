package com.myproject.tekit_kotlin_study.Week1.Kotlin13_BreakContinue

// break : 가장 가까운 반복문의 수행을 중단시킨다.
// continue : 다음 반복으로 넘어간다.

fun main(){
    for(v1 in 1..10){
        println("v1 : $v1")
    }

    for(v1 in 1..10){
        if(v1 > 5){
            break
        }
        println("v1 : $v1")
    }

    for(v2 in 1..10){
        println("v2 : $v2")
    }

    for(v2 in 1..10){
        if(v2 % 2 == 0){
            continue
        }
        println("v2 : $v2")
    }
}

