package org.fabiomsr.rxgroovy._00_creators

import rx.Observable
import rx.functions.Action1

/**
 * Created by fabiomsr on 29/10/16.
 */
class _00_Just {

    def static groovy(){
        println 1
        println 2
        println 3
    }

    def static rxGroovy(){
        Observable.just(1, 2, 3)
                  .subscribe { number -> println number }
        // or .subscribe { println it }
    }

    static void main(String... args) {
        println 'Result: Groovy version'
        groovy()
        println 'Result: RxGroovy version'
        rxGroovy()
    }
}
