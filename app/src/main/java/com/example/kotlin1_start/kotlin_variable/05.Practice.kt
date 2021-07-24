package com.example.kotlin1_start.kotlin_variable


fun sum(vararg numbers : Int) : Int{
    var result : Int = 0;
    for(number in numbers){
        result += number;
    }
    return result;
}

fun minus(first : Int , Second : Int) : Int {

    return first - Second;
}

fun minus1(vararg numbers : Int) : Int{
    var result : Int = 0;

    var result1 : Int = numbers[0];

    for(number in numbers){
        if(number == result1){
            number == 0;
            result = number;
        }
        result -= number;
    }
   return result1 + result;
}

fun multiply(vararg numbers : Int) : Int{
    var result : Int = 1;

    for(number in numbers){
        result *= number;
    }

    return result;
}

fun divide(first : Double , Second: Double) : Double{
    var result :  Double = first/Second;

    return result;
}

// 내부함수
fun plusFun(first: Int, Second: Int) : Int{
//    return first + Second;
    fun plus(first: Int, second : Int) : Int{
        return first + second;
    }
    return plus(first,Second);
}

fun main(args:Array<String>){
    println(sum(1,3,5));
    println(minus1(1,3,5));
    println(multiply(1,2,1,4));
    println(divide(3.0,2.0));
    println(plusFun(1,2));
}