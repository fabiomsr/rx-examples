package org.fabiomsr.rxkotlin._00_creators

import rx.Observable

/**
 * Created by fabiomsr on 29/10/16.
 */

private fun kotlin() {
    println(1)
    println(2)
    println(3)
}

private fun rxKotlin() {
    Observable.just(1, 2, 3)
              .forEach { number -> println(number) }
    // or .forEach { println(it) }
    // or .forEach(::println)
    // or .subscribe(::println)
}

fun main(args : Array<String>){
    println ("Result: Kotlin version")
    kotlin()
    println ("Result: RxKotlin version")
    rxKotlin()
}