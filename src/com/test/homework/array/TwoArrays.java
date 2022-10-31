package com.test.homework.array;

import java.util.Scanner;

public class TwoArrays {
    /*
    1. Create an Array of Strings, size 10
    2. Create an Array of int, size 10
    3. Read from the console and fill in the Array with Strings
    4. Fill in the int Array with length of Strings from the first Array.
        If the first element contains "Hello", we put in the first element of int Array - 5
    5. Print the int Array to the console
     */
    public static void main(String[] args) {
        //implement me

        Scanner sc = new Scanner(System.in);

        String[] array = new String[10];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextLine();
        }

        int[] arrayNumber = new int[10];


        for (int i = 0; i < array.length; i++) {
                arrayNumber[i] = array[i].length();
        }

        System.out.println("the new array");
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayNumber[i] + " ");
        }
    }
}
