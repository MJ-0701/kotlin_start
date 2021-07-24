package com.example.kotlin1_start.kotlin_variable

// 함수 선언방법
// fun 함수명 (변수명 : 타입, 변수명:타입, ...) : 반환형 {
//      함수내용
//  return 반환값
// }


fun example() : String{

    return "";
}

fun sum(first : Int, second : Int) : Int{
    val sum : Int = first + second;

    return sum;
}

// default 값 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5) : Int{
   val result : Int = first + second;
    return result;
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int) : Unit{ // Unit -> 아무것도 리턴하지 않겠다. -> java void
    val result : Int = first + second;
    println(result);
}

// 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second;

// 가변인자를 갖는 함수 선언 방법
fun plusMany(vararg numbers : Int){ // varargs 를 사용하면 1개부초 n개 까지 받을수 있다.
    for(number in numbers){
        println(number);
    }
}

fun main(args:Array<String>){

    println(sum(1,2));
    println(plusFive(1,2));
    println(plusFive(1));
    println(printPlus(10,10));
    println("가변인수 : "+plusMany(1,2,3));
}