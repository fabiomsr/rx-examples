package org.fabiomsr.rxkotlin._00_creators

import rx.Observable

/**
 * Created by fabiomsr on 29/10/16.
 */

private fun kotlin(numbers: List<Int>) {
    numbers.forEach(::println)
}

private fun rxKotlin(numbers: List<Int>) {
    Observable.from(numbers)
              .forEach(::println)
}

fun main(args : Array<String>){
    val numbers = listOf(1, 2, 3)
    println ("Result: Kotlin version")
    kotlin(numbers)
    println ("Result: RxKotlin version")
    rxKotlin(numbers)
}