package com.test.homework.array;

import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {
        //implement me
        Scanner sc=new Scanner(System.in);

        String[] array = new String[10];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<8; i++) {
            array[i]=sc.nextLine();
        }

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=array.length-1;i>=0;i--)
            System.out.println(array[i] + "  ");
    }
}
