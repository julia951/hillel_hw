package com.test.homework.array;

import java.util.Scanner;

public class MaxOf20 {
    /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */

    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println(maxNumber);
    }

    private static int[] initializeArray() {
        // implement me

        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<20; i++) {
            array[i]=sc.nextInt();
        }

        return array;
    }

    private static int max(int[] array) {
        // implement me

        int max = array[0];
        for(int i = 1 ; i < array.length;i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
