package com.test.homework.equals_hashcode;

public class Cat {
    /*
    Override methods equals() and hashCode() that it took @name and @age
    Create several object with the same names and ages and different and print the result of comparing
    Override toString method - when we call System.out.println(cat) -> it should print: "Cat name: Tom, age: 5, weight: 3"
     */

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
