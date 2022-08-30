package com.test.homework.oop.polymorphism;

    /* Nothing prints
    Override method getName in the class Whale,
    that the program prints nothing.
    */

public class Solution2 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm cow";
        }
    }

    public static class Whale extends Cow {

    }
}
