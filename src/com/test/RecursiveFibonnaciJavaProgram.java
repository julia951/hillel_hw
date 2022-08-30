package com.test;

public class RecursiveFibonnaciJavaProgram {

    public static void main(String args[]) {
        int count = 20;

        for (long i = 1; i <= count; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    /* A recursive Fibonnaci sequence in Java program */
    public static long fibonacci(long number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

