package com.example.kotlin1_start.kotlin_variable


var a : Int = 1 + 2 + 3 + 4 + 5;
var b : String = "1";
var c : Int = b.toInt();
var d : Float = b.toFloat();
var e : String = "Jack";
var f = "My name is $e Nice to meet you";

// var num1 : Int = null; // Syntax error
var num2 : Int? = null; // null 값 가능
var num3 = null;

fun main(args:Array<String>){

    println(a);
    println(b);
    println(c);
    println(d);
    println(e);
    println(f);

}