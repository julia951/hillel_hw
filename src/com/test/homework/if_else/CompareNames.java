package com.test.homework.if_else;

import java.util.Scanner;

public class CompareNames {
    /*
    Enter and reed two names from the console
    Implement method which prints:
    If names are the same - "Names are the same"
    If names are different but length them are the same - "Length of names are the same"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two names:");
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        printComparisonNameResult(firstName, secondName);
        scanner.close();
    }

    private static void printComparisonNameResult(String firstName, String secondName) {
        //Implement me
    }
}
