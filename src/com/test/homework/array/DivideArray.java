package com.test.homework.array;

import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        // implement me


        Scanner sc=new Scanner(System.in);

        int[] array = new int[20];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<20; i++) {
            array[i]=sc.nextInt();
        }

        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        for(int i=0; i<10; i++) {
            firstArray[i]=array[i];
        }
        int j=0;

        for(int l=11; l<20; l++) {
            //int j=0;
                secondArray[j] = array[l];
                j++;
        }

        System.out.println("The second array: ");

        for(int i=0; i<10; i++) {
            System.out.println(secondArray[i]+" ");
        }
    }
}
