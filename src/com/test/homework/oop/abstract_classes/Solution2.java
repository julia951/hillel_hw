package com.test.homework.oop.abstract_classes;

public class Solution2 {
    /*
    Extend classes Cat and Dog from Pet
    Implement all the necessary methods
    Classes Cat and Dog should not be abstract
     */

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public abstract static class Cat {
    }

    public static class Dog {
    }
}
