package com.test.homework.oop.encapsulation;

public class Cat2 {
    /*
    Close access to all internal variables
    but only for which we can get access through the methods
    */

    String name;
    int age;
    int weight;
    String color;

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
