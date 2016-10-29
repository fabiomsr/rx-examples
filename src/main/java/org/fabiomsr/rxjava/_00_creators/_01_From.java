package org.fabiomsr.rxjava._00_creators;

import rx.Observable;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by fabiomsr on 29/10/16.
 */
public class _01_From {

    private static void java(Integer[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void java8(Integer[] numbers) {
        Arrays.stream(numbers)
                .forEach(System.out::println);
    }

    private static void rxJava(Integer[] numbers) {
        Observable.from(numbers)
                  .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        System.out.println("Result: Java version");
        java(numbers);
        System.out.println("Result: RxJava version");
        rxJava(numbers);
    }

}
