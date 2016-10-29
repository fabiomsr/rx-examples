package org.fabiomsr.rxgroovy._00_creators

import rx.Observable

/**
 * Created by fabiomsr on 30/10/16.
 */
class _01_From {

    def static groovy(int[] numbers){
        numbers.each { println it}
    }

    def static rxGroovy(int[] numbers){
        Observable.from(numbers)
                .forEach { println it }
    }

    static void main(String... args) {
        int[] numbers = [1, 2, 3]
        println 'Result: Groovy version'
        groovy(numbers)
        println 'Result: RxGroovy version'
        rxGroovy(numbers)
    }

}
