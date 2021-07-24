package com.example.kotlin1_start.kotlin_variable


// var : 변수
// val : 상수(final)

var num = 10;
private var hello = "hello";
val fix = 20;

fun main(args:Array<String>){
//    println(num);
//    println(hello);
//    println(fix);

    num = 100;
    hello = "good Bye";
    println(num);
    println(hello);
    println(fix);

}