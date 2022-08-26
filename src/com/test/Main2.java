package com.test;

public class Main2 {
    public static void main(String[] args) {
        printMessage("Hello world!");
        printSum(5, 6);
    }

    private static void printSum(int i, int j) {
        printMessage(String.valueOf(i + j));
    }

    private static void printMessage(String s) {
        System.out.println(s);
    }
}
