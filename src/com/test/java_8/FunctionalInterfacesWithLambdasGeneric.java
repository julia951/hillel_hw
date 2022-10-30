package com.test.java_8;

public class FunctionalInterfacesWithLambdasGeneric {

    @FunctionalInterface
    interface Operator<T> {
        T process(T a, T b);
    }

    public static void main(String[] args) {
        Operator<Integer> addOperation = (i, j) -> i + j;
        System.out.println(addOperation.process(5, 6));

        Operator<String> appendOperation = (a, b) -> a + b;
        System.out.println(appendOperation.process("5", "6"));

        Operator<Integer> multiplyOperation = (a, b) -> a * b;
        System.out.println(multiplyOperation.process(5, 6));
    }
}
