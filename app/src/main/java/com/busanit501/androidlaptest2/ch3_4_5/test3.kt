package com.busanit501.androidlaptest2.ch3_4_5

class test3 {
}
fun main(){
    //함수에 반환 타입이 없이 할당
    val some = {no:Int -> println("no : $no") }
    some(10)

    //it
    //함수 타입 존재
    val some2:(Int) -> Unit = {println("no : $it") }
    some2(100)

}