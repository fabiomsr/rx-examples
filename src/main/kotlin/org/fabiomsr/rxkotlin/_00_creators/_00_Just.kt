package org.fabiomsr.rxkotlin._00_creators

import rx.Observable

/**
 * Created by fabiomsr on 29/10/16.
 */

fun kotlin() {
    println(1)
    println(2)
    println(3)
}

fun rxKotlin() {
    Observable.just(1, 2, 3)
              .subscribe { number -> println(number) }
    // or .subscribe { println(it) }
    // or .subscribe(::println)
}

fun main(args : Array<String>){
    println ("Result: Kotlin version")
    kotlin()
    println ("Result: RxKotlin version")
    rxKotlin()
}