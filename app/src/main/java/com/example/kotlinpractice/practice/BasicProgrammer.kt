package com.example.kotlinpractice.practice

/*
 * 包声明
 * 目录与包的结构无需匹配
 * 源代码可以在文件系统的任意位置
 */
// package my.demo
// import kotlin.text.*


/*
 * Kotlin应用程序的入口点是main函数
 */
fun main() {
    println("Hello world!!!")
}


/*
 * 参数为Int，返回值为Int
 */
//fun sum(a: Int, b: Int): Int {
//    return a + b;
//}

/*
 * 将表达式作为函数体，返回值类型自动推断
 */
//fun sum(a: Int, b: Int) = a + b;


/*
 * 返回无意义的值
 */
fun sum(a: Int, b: Int): Unit {
    println("sum of $a and $b is${a + b}")
}

/*
 * 返回无意义的值
 */