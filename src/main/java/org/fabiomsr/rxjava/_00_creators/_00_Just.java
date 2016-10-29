package org.fabiomsr.rxjava._00_creators;

import rx.Observable;

/**
 * Created by fabiomsr on 29/10/16.
 */
public class _00_Just {

    private static void java() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }

    private static void rxJava() {
        Observable.just(1, 2, 3)
                  .forEach(number -> System.out.println(number));
        // or .forEach(System.out::println)
        // or .subscribe(System.out::println)
    }

    public static void main(String[] args) {
        System.out.println("Result: Java version");
        java();
        System.out.println("Result: RxJava version");
        rxJava();
    }

}
